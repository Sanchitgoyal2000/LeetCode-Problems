class Solution {
    public int[] plusOne(int[] digits) {
       int h=0,c=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            int sum=digits[i]+c;
            digits[i]=sum%10;
            c=sum/10;
            if(i==0&&c==1)
            {
                h=1;
            }
        }
        if(h==1)
        {
            int ans[]=new int[digits.length+1];
            ans[0]=1;
            for(int i=1;i<=digits.length;i++)
            {
                ans[i]=digits[i-1];
            }
            return ans;
        }
        return digits;
}
}
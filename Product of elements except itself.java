class Solution {
    public int[] productExceptSelf(int[] nums) {
        int s=1,p=0,h=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            s=s*nums[i];
            else
            {
                h++;
            }
        }
       
        if(h==1)
        {
            p=s;
            s=0;
        }
        else if(h>1)
        {
            s=0;
            p=0;
        }
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            ans[i]=s/nums[i];
            else
            {
                 ans[i]=p;
            }
        }
        return ans;
    }
}
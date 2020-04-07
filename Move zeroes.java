class Solution {
    public void moveZeroes(int[] nums) {
        int numZeros = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                numZeros++;
            }else{
                nums[i - numZeros] = nums[i];
            }
        }
        for (int i = 0; i < numZeros; i++){
            nums[nums.length-i-1] = 0;
        }
                       OR
        ------------------------------------------
        int z=0,z1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                z1++;
        }
        if(z1==0)
        {
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                z++;
            else
            {
                int p=0,h=0;
                for(int j=i;j>=0;j--)
                {
                    if(nums[j]==0)
                    {
                        p=j;
                        h=1;
                    }
                }
                if(h==1)
                {
                nums[p]=nums[i];
                nums[i]=0;
                }
            }
        }
        for(int i=nums.length-1;i>nums.length-z1;i--)
        {
            nums[i]=0;
        }
    }
}
class Solution {
    public int partitionDisjoint(int[] nums) 
    {
        int ans=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            int j,h=0;
            max=Integer.MIN_VALUE;
            for( j=0;j<i;j++)
            {
              if(nums[j]>max)
                  max=nums[j];
            }
          for(int k=j;k<nums.length;k++)
          {
              if(max>nums[k])
              {
                  h=1;
                  break;
              }
          }
            if(h==0)
            {
                if(i<ans)
                    ans=i;
            }
        }
        return ans;
    }
}
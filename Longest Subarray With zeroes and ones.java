class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++)      //0 1 0 1 1 1 0 0 will be -1 1 -1 1 1 1 -1 -1
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        int sum=0,l=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(hm.containsKey(sum))
            {
                if(i-hm.get(sum)>l)
                {
                    l=i-hm.get(sum);
                }
            }
            else
            {
                hm.put(sum,i);
            }
            if(sum==0)
            {
                if(i>l)
                    l=i+1;
            }
        }                        
        return l;
    }
}
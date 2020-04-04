class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]-1;   //for test case [1] it becomes 1+1=2 and 2/1==2 so wrong result
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[(nums[i])%nums.length]=nums[(nums[i])%nums.length]+nums.length;
        }
        for(int i=0;i<nums.length;i++)
        {
               if(nums[i]/nums.length>=2)
                l.add(i+1);
        }
        return l;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ind = new HashMap<>();
        boolean flag = false;
        int i;
        for(i = 0;i<nums.length;i++)
        {
            if(ind.containsKey(target-nums[i]))
            {
                flag = true;
                break;
            }
            else
            {
                ind.put(nums[i],i);
                continue;
            }
        }
        return new int[]{ind.get(target-nums[i]),i};
    }
}

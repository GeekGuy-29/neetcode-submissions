class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> disNums = new HashSet<Integer> ();
        boolean flag = false;
        for(int i : nums)
        {
            disNums.add(i);
        }
        if(disNums.size() == nums.length)
            return false;
        else
            return true;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num:nums)
        {
            set.add(num);
        }
        int count = 0;
        for(int i : set)
        {
            int innerCount = 0;
            if(set.contains(i-1))
                continue;
            while(set.contains(i+1))
            {
                innerCount++;
                i++;
            }
            count = Math.max(count,innerCount+1);
        }
        return count;
    }
}

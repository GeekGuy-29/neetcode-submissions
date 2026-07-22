class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>
                                         ((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            pq.add(entry);
        }
        for(int i = 0;i < k;i++)
        {
            answer[i]=pq.poll().getKey();
        }
        return answer;
    }
}

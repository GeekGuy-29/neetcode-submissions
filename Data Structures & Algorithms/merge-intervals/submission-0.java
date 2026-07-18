class Solution {
    public int[][] merge(int[][] intervals) {
       if (intervals.length == 0) {
            return new int[0][];
        }
       else{
            List<int[]> answer = new ArrayList<>();
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            int[] current = intervals[0];
            for(int i=1;i<intervals.length;i++)
            {
            if(current[1]>=intervals[i][0])
            {
                current[1]=Math.max(current[1],intervals[i][1]);
            }
            else
            {
                answer.add(current);
                current=intervals[i];
            }
            } 
            answer.add(current);
            return answer.toArray(new int[answer.size()][]);
       }
    }
}

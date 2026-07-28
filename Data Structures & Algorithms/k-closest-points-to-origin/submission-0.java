class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        for(int i=0 ; i<points.length; i++)
        {
            int distance = points[i][0] * points[i][0] +
                           points[i][1] * points[i][1];
            int[] data = { distance,
                            points[i][0],
                            points[i][1]};
            if(pq.size()<k)
            {
                pq.offer(data);
                continue;
            }
            else if(pq.peek()[0]>data[0])
            {
                pq.poll();
                pq.offer(data);
            }
        }
        int[][] res = new int[k][2];
        for(int i=0; i<k; i++)
        {
            res[i][0] = pq.peek()[1];
            res[i][1] = pq.peek()[2];
            pq.poll();
        }
        return res;
    }
}

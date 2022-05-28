class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int pos=0;
        for (int[] row : mat){
            int lo = 0, hi = row.length; 
            while(lo < hi){
                int mid = (lo + hi) / 2;
                if (row[mid] != 0) lo = mid + 1;
                else hi = mid;
            }
            q.add(new int[]{lo, pos++});
        }
        
        int[] output = new int[k];
        for(int i = 0; i < k; i++)  output[i] = q.remove()[1];
        return output;
    }
}
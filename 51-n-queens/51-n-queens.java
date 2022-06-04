class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] c = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(c[i], '.');
        List<List<String>> ans=new ArrayList<List<String>>();
        recur(0,0,n,c,ans);
        
        return ans;
    }
    
     static void recur(int q, int c, int n, char[][] b,List<List<String>> ans) {
        if (q == n) {
           List<String> s=new ArrayList<>();
            StringBuilder st=new StringBuilder();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    st.append(b[i][j]);
                }
                s.add(st.toString());
                st.setLength(0);
            }
            ans.add(s);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (noQ(i, c, b)) {
                b[i][c] = 'Q';
                recur(q + 1, c + 1, n, b,ans);
                b[i][c] = '.';
            }
        }
    }

    static boolean noQ(int r, int c, char[][] b) {
        int n = b.length;
        for (int i = 0; i < n; i++) {
            if (b[i][c] == 'Q' || (b[r][i] == 'Q'))
                return false;
            if ((r - i > -1) && (c + i < n) && b[r - i][c + i] == 'Q')
                return false;
            if ((r + i < n) && (c - i > -1) && b[r + i][c - i] == 'Q')
                return false;
            if ((r - i > -1) && (c - i) > -1 && b[r - i][c - i] == 'Q')
                return false;
        }
        return true;
    }
}
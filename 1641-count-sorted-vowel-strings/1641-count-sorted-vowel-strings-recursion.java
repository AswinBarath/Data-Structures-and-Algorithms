class Solution {
    public int countVowelStrings(int n) {
        return countstrings(n,0);
    }
    public int countstrings(int n, int start)
    {        
        // Base case
        if (n == 0) {
            return 1;
        }
        int cnt = 0;
        
        // Recursive case
        for (int i = start; i < 5; i++)
        {
            cnt += countstrings(n - 1, i);
        }
        return cnt;
    }
}

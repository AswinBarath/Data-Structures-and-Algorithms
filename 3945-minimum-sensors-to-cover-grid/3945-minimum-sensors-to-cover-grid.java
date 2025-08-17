class Solution {
    public int minSensors(int n, int m, int k) {
        int diameter = (2 * k) +  1;
        int n_sensors = (int) Math.ceil((double) n / (double) diameter);
        // System.out.println(Math.ceil((double) n / (double) diameter));
        int m_sensors = (int) Math.ceil((double) m / (double) diameter);
        return n_sensors * m_sensors;
    }
}

/*
I referred this solution: https://leetcode.com/problems/minimum-sensors-to-cover-grid/solutions/7089328/o-1-using-simple-math-python3
I then drew the dry run grid for example 1
Then I imagined the dry run grid in head for 10x10 matrix with k = 1 and realized the answer is 16 and confirmed by testing the expected answer using testcase
*/
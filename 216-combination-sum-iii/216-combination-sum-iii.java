class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> answer = new ArrayList<>();
        helper(k, n, 1, new LinkedList(), answer);
        return answer;
    }
    public void helper(int k, int n, int i, LinkedList ll, List<List<Integer>> ans) {
        // Base case        
        if(k < 0 || n < 0) {
            return;
        }
        if(k == 0 && n == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        // Recursive case
        for(int ele = i; ele <= 9; ele++) {
            ll.add(ele);
            helper(k - 1, n - ele, ele + 1, ll, ans);
            ll.removeLast();
        }
    }
}
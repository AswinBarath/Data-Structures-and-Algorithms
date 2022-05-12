class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> answer = new ArrayList<>();
		List<Integer> permutation = new ArrayList<>();
		Map<Integer, Integer> count = new HashMap<>();

		for (int n : nums) {
			if (count.containsKey(n)) {
				count.put(n, count.get(n) + 1);
			} else {
				count.put(n, 1);
			}
		}
		permuteUnique(nums, count, permutation, answer);
		return answer;
	}

	public void permuteUnique(int[] nums, Map<Integer, Integer> count, List<Integer> permutation,
			List<List<Integer>> answer) {
		if (permutation.size() == nums.length) {
			answer.add(new ArrayList<>(permutation));
			return;
		}
		for (int n : count.keySet()) {
			if (count.get(n) > 0) {
				count.put(n, count.get(n) - 1);
				permutation.add(n);
				permuteUnique(nums, count, permutation, answer);
				permutation.remove(permutation.size() - 1);
				count.put(n, count.get(n) + 1);
			}
		}
	}
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> answer = new ArrayList<>();
		permute(nums, new ArrayList<>(), answer);
		return answer;
	}

	public void permute(int[] nums, List<Integer> permutation, List<List<Integer>> answer) {
		if (permutation.size() == nums.length) {
			answer.add(new ArrayList<>(permutation));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (permutation.contains(nums[i]))
				continue; // element already exists, skip
			permutation.add(nums[i]);
			permute(nums, permutation, answer);
			permutation.remove(permutation.size() - 1);
		}
	}
}
class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1)
            return 0;

        int jmp_count = 0;
        int left = 0;

        while (left < nums.length - 1) {
            jmp_count++;

            if (left + nums[left] >= nums.length - 1)
                break;
            left = find_best_candidate(nums, left + 1, Math.min(left + nums[left], nums.length - 1));
        }

        return jmp_count;
    }

    private int find_best_candidate(int nums[], int left, int right) {
        int max_jump = 0;
        int best_candidate_idx = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] + i > max_jump) {
                max_jump = nums[i] + i;
                best_candidate_idx = i;
            }
        }
        return best_candidate_idx;
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;

        int right = nums.length - 1;
        boolean value_found = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                value_found = true;
                while (nums[right] == val && right > i)
                    right--;
                swap(nums, i, right);
            }
            if (right < i)
                break;
        }
        if (!value_found)
            right++;
        return right;
    }

    private void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
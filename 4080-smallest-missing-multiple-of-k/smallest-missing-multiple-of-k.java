class Solution {
    public int missingMultiple(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0 && nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] % k == 0 && nums[i] < min) {
                min = nums[i];
            }
            set.add(nums[i]);
        }

        int mis = 0;

        for (int i = k;; i += k) {
            if (!set.contains(i)) {
                mis = i;
                break;
            }
        }

        return mis;
    }
}
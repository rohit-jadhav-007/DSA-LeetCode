class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int answer = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (value > max || (value == max && key < answer)) {
                max = value;
                answer = key;
            }
        }
        return answer;
    }
}
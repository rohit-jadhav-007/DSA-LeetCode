class Solution {
    public int findKthLargest(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Then we still need to process keys in descending order
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        for (int num : keys) {
            k = k - map.get(num);

            if (k <= 0) {
                return num;
            }
        }

        return -1;
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        for(int num : keys){
            k = k - map.get(num);
            if(k<=0){
                return num;
            }
        }

        return -1;
    }
}
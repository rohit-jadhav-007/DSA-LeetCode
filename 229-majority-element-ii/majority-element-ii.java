class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int n = nums.length/3;
        List<Integer> list = new ArrayList<>();
        for(int num : map.keySet()){
            if(map.get(num) > n){
                list.add(num);
            }
        }
        return list;
    }
}
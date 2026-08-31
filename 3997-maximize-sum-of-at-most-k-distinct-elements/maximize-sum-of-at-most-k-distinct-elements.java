class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int size = Math.min(k, set.size());
        int result[] = new int[size];
        int i = 0;
        for(int num : set){
            if(i==k){
                break;
            }
            result[i] = num;
            i++;
        }
        return result;
    }
}
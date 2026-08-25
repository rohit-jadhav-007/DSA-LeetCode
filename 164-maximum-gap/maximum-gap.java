class Solution {
    public int maximumGap(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int max = 0;

        for(int num : set){
            Integer prev = set.lower(num);

            if(prev != null){
                int diff = num - prev;

                if(diff > max){
                    max = diff;
                }
            }
        }
        return max;
    }
}
class Solution {
    public int smallestAbsent(int[] nums) {
        long sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        long avg = sum / nums.length +1;
        avg = Math.max(avg, 1);

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == avg){
                avg++;
                i = -1;
            }
        }
        return (int) avg;
    }
}
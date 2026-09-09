class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        long sum = 0;
        while(i<=j){
            if(i!=j){
                sum = sum + Integer.parseInt(nums[i]+""+nums[j]);
            } else {
                sum = sum + nums[i];
            }
            i++;
            j--;
        }
        return sum;
    }
}
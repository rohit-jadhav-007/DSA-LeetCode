class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                sum = sum * nums[i];
            }else {
                count++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(count >= 2){
                nums[i] = 0;
            } else if (count == 1){
                if(nums[i] !=0){
                    nums[i] = 0;
                } else {
                    nums[i] = sum;
                }
            } else {
                nums[i] = sum / nums[i];
            }
        }

        return nums;
    }
}
class Solution {
    public int arraySign(int[] nums) {
        int countNegative = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                return 0;
            }else if(nums[i] <0){
                countNegative++;
            }
        }   

        return signFunc(countNegative);
    }

    public static int signFunc(int x){
        
        if(x%2 == 0){
            return 1;
        } else{
            return -1;
        }
    }
}
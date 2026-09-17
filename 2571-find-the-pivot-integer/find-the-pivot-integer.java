class Solution {
    public int pivotInteger(int n) {
        int rightSum = n;
        int leftSum = 1;

        int i = 1;
        int j = n;
        while(i <= j){
            if(rightSum == leftSum && i == j){
                return i;
            } else if (rightSum > leftSum){
                i++;
                leftSum = leftSum + i;
            } else {
                j--;
                rightSum = rightSum + j;
            }
        }
        return -1;
    }
}
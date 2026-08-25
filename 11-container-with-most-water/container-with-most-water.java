class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int area = 0;

        int i = 0;
        int j = height.length-1;

        while(i<j){
            if (height[i] > height[j]){
                area = height[j] * (j-i);
                j--;
            }  else if (height[i] <= height[j]){
                area = height[i] * (j-i);
                i++;
            }

            if(area > max){
                max = area;
            }
        }
        return max;
    }
}
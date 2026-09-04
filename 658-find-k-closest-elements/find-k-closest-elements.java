class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();

        for(int num : arr){
            result.add(num);
        }
        while(result.size() > k){
            int left = 0;
            int right = result.size()-1;

            if(Math.abs(result.get(left) - x) > Math.abs(result.get(right) - x)){
                result.remove(0);
            } else {
                result.remove(result.size()-1);
            }
        }
        return result;
    }
}
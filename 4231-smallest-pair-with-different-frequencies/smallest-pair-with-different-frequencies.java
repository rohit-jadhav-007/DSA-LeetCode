class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        if(nums.length<=2){
            return new int[]{-1, -1};
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry1 : map.entrySet()){
            int x = entry1.getKey();
            int freqX = entry1.getValue();
            for(Map.Entry<Integer, Integer> entry2 : map.entrySet()){
                int y = entry2.getKey();
                int freqY = entry2.getValue();

                if(x<y && freqX != freqY){
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
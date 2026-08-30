class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                int value = grid[i][j];
                map.put(value, map.getOrDefault(value, 0)+1);
            }
        }
        int repeated = 0;
        int missing = 0;
        int total = grid.length*grid.length;

        for(int i = 1; i <= total;i++){
            if(map.getOrDefault(i, 0)==2){
                repeated = i;
            }
            if(map.getOrDefault(i, 0)==0){
                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
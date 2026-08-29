class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>();
        for(int i = 0;i<names.length;i++){
            map.put(heights[i], names[i]);
        }

        String result[] = new String[map.size()];
        int i = 0;
        for(String value : map.descendingMap().values()){
            result[i++] = value;
        }
        return result;
    }
}
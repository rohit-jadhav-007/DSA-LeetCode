class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0;i<bulbs.size();i++){
            map.put(bulbs.get(i), map.getOrDefault(bulbs.get(i), 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 != 0){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
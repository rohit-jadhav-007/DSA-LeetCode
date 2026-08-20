class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        int oddMax = 0;
        int evenMin = Integer.MAX_VALUE;

        for(int freq: map.values()){
            if(freq % 2 == 0){
                if(freq < evenMin){
                    evenMin = freq;
                }
            }

            if(freq % 2 != 0){
                if(freq > oddMax){
                    oddMax = freq;
                }
            }
        }
        return oddMax-evenMin;
    }
}
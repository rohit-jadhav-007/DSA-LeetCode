class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map1.put(s.charAt(i), i);
            map2.put(t.charAt(i), i);
        }
        int diff = 0;
        for(char ch : map1.keySet()){
            diff += Math.abs(map1.get(ch) - map2.getOrDefault(ch, 0));
        }
        return diff;
    }
}
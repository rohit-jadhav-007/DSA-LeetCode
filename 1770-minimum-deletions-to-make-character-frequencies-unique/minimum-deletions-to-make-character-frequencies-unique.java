class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int freq : map.values()){
            while(freq > 0 && set.contains(freq)){
                freq--;
                count++;
            }
            set.add(freq);
        }
        return count;
    }
}
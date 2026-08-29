class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<word.length();i++){
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) +1);
        }

        int count = 0;
        for(char ch = 'a'; ch <='z';ch++){
            if(map.containsKey(ch) && map.containsKey(Character.toUpperCase(ch))){
                count++;
            }
        }
        return count;
    }
}
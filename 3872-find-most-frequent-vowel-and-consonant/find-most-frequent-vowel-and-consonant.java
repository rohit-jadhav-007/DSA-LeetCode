class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowels = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                vowels.put(s.charAt(i), vowels.getOrDefault(s.charAt(i), 0) + 1);
            } else if (s.charAt(i) > 'a' && s.charAt(i) <= 'z'){
                consonant.put(s.charAt(i), consonant.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        int max1 = 0;
        int max2 = 0;

        for(int freq : vowels.values()){
            if(freq > max1 ){
                max1 = freq;
            }
        }

        for(int freq : consonant.values()){
            if(freq > max2 ){
                max2 = freq;
            }
        }

        return max1+max2;
    }
}
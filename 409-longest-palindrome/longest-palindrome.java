class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        int sum = 0;
        boolean odd = false;
        for(int val : map.values()){
            if(val % 2 == 0){
                sum = sum + val;
            } else {
                sum = sum + val -1;
                odd = true;
            }
        }
        if(odd){
            sum++;
        }
        return sum;
    }
}
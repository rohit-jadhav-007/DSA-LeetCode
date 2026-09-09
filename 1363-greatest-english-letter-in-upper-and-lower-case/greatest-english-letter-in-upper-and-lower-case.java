class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<>();
        char greatest = 0;
        for(int i = 0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i)) && set.contains(Character.toLowerCase(s.charAt(i)))){
                if(Character.toUpperCase(s.charAt(i)) > greatest){
                    greatest = Character.toUpperCase(s.charAt(i));
                }
            } else if (Character.isLowerCase(s.charAt(i)) && set.contains(Character.toUpperCase(s.charAt(i)))){
                if(Character.toUpperCase(s.charAt(i)) > greatest){
                    greatest = Character.toUpperCase(s.charAt(i));
                }
            }
            set.add(s.charAt(i));
        }
        return greatest == 0 ? "" : String.valueOf(greatest);
    }
}
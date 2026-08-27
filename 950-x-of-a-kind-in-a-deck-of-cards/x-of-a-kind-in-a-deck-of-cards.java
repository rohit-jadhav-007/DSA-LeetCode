class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length < 2){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<deck.length;i++){
            map.put(deck[i], map.getOrDefault(deck[i], 0)+1);
        }

        int gcd = 0;

        for(int freq : map.values()){
            gcd = findGcd(gcd, freq);
        }

        return gcd > 1;
    }

    public static int findGcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
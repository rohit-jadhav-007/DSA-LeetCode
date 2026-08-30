class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flush = true;
        for(int i = 0;i<suits.length-1;i++){
            if(suits[i] != suits[i+1]){
                flush = false;
                break;
            }
        }

        if(flush){
            return "Flush";
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<ranks.length;i++){
            map.put(ranks[i], map.getOrDefault(ranks[i], 0)+1);
        }

        for(int num : map.values()){
            if(num >= 3){
                return "Three of a Kind";
            }
        }
        for(int num : map.values()){
            if(num == 2){
                return "Pair";
            }
        }
        return "High Card";
    }
}
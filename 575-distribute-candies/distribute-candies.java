class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int type = 1;

        for(int i = 1;i<candyType.length; i++){
            if(candyType[i]!=candyType[i-1]){
                type++;
            }
        }

        int eat = candyType.length/2;

        if(type<eat){
            return type;
        }else{
            return eat;
        }
    }
}
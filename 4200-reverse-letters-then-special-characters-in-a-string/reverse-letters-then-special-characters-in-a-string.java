class Solution {
    public String reverseByType(String s) {
        int i = 0;
        int j = s.length()-1;
        char arr[] = s.toCharArray();
        while(i<j){
            if(!Character.isLetter(arr[i])){
                i++;
                continue;
            }
            if(!Character.isLetter(arr[j])){
                j--;
                continue;
            }
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        i=0;
        j=s.length()-1;
        while(i<j){
            if(Character.isLetter(arr[i])){
                i++;
                continue;
            }
            if(Character.isLetter(arr[j])){
                j--;
                continue;
            }
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        return new String(arr);
    }
}
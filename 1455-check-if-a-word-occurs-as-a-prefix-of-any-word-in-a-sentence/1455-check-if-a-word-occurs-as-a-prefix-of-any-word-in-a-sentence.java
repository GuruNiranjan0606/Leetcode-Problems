class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[]=sentence.split(" ");
        int count=1;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<searchWord.length();j++){
                if(arr[i].length()>=searchWord.length()&&arr[i].charAt(j)==searchWord.charAt(j)){
                    count++;
                    ans=i+1;
                }else if(j==count+1){
                    break;
                }
                else{
                    count=0;
                    ans=0;
                    break;
                }
            }
            if(ans>0){
                break;
            }
        }
        if(ans>0){
            return ans;
        }
        else{
            return -1;
        }
    }
}
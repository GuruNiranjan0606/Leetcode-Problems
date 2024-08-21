class Solution {
    public int maxRepeating(String sequence, String word) {
        // char arr[]=sequence.toCharArray();
        // char arr1[]=word.toCharArray();
        // int n,count=0,sum=0;

        // for(int i=0;i<arr.length;i++){
        //     n=i;
        //     for(int j=0;j<arr1.length;j++){
        //         if(arr[n]==arr1[j]){
        //             count++;
        //             n++;
        //         }
        //         else{
        //             count=0;
        //             break;
        //         }
        //     }
        //     if(count==arr1.length){
        //         sum++;
        //     }

        // }
        // return sum;
        int maxRepeats = 0;
        String repeatedWord = word;

        while (sequence.contains(repeatedWord)) {
            maxRepeats++;
            repeatedWord += word;
        }

        return maxRepeats;
    }
}
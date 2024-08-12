class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=2;i<arr.length;i++){
            if(isodd(arr[i])&&isodd(arr[i-1])&&isodd(arr[i-2])){
                return true;
            }
        }
        return false;
        
    }
    public boolean isodd(int n){
        if(n%2==0){
            return false;
        }
        else{
            return true;
        }
    }
}
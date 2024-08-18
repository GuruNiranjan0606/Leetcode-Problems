class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=dig(nums[i]);
            if(n%2==0){
                count++;
            }
            
        }
        return count;
        
    }
    public int dig(int n){
        int count=0;
        while(n>0){
            int digit=n%10;
            count++;
            n/=10;
        }
        return count;
    }
}
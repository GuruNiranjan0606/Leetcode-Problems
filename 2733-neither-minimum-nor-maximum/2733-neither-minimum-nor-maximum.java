class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        if(nums.length<=2){
            n+=-1;
        }
        else{
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[0]&&nums[i]!=nums[nums.length-1]){
                    n+=nums[i];
                    break;
                }
            }
        }
        return n;
    }
}
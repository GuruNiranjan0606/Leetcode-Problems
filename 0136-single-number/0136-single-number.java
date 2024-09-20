class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       int sum=0;
       for(Map.Entry<Integer,Integer> val:hm.entrySet()){
        if(val.getValue()==1){
             return val.getKey();
        }
       }
       return sum;
    }
}
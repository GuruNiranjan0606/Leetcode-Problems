class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<List<Integer>>al=new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>();
        HashSet<Integer>hs1=new HashSet<>();
        HashSet<Integer>hs2=new HashSet<>();
        for(int val:nums1){
            hs1.add(val);
        }
        for(int val:nums2){
            hs2.add(val);
        }
        for(int val:nums1){
            if(!hs2.contains(val)){
                arr1.add(val);
            }
        }
        for(int val:nums2){
            if(!hs1.contains(val)){
                arr2.add(val);
            }
        }
        al.add(arr1);
        al.add(arr2);
        return al;



    }
}
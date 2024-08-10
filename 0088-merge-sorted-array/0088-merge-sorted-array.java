class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int [m+n];
        int j=0;
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=m;i<m+n;i++){
            arr[i]=nums2[j];
            j++;
        }
        Arrays.sort(arr);
        for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
        
    }
}
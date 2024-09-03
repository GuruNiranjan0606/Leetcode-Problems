class Solution {
    public int secondHighest(String s) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                hs.add(Integer.parseInt(s.charAt(i)+""));
            }
        }
        int n=hs.size();
        int arr[]=new int[n];
        int i=0;
        for(int val:hs){
            arr[i]=val;
            i++;
        }
        Arrays.sort(arr);
        int ans;
        if(n==1||n==0){
            ans=-1;
        }
        else{
            ans=arr[n-2];
        }
        return ans;
    }
}
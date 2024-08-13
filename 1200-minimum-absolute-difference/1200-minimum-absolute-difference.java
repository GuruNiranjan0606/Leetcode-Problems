class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>>list=new ArrayList<>();
        int dif=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            dif=Math.min(dif,Math.abs(arr[i-1]-arr[i]));
        }
        dif=Math.abs(dif);
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i-1]-arr[i])==dif){
                list.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return list;
    }
}
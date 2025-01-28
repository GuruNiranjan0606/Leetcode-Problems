class Solution {
    public int maximum69Number (int num) {
        int max=0;
        String n=Integer.toString(num);
        StringBuilder sb=new StringBuilder(n);
        for(int i=0;i<n.length();i++){
            if(sb.charAt(i)=='6'){
                sb.setCharAt(i,'9');
                break;
            }
        }
            if(max<Integer.parseInt(sb.toString())){
                max=Integer.parseInt(sb.toString());
            }
        
        return max;
        
    }
}
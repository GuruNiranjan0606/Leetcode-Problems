class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                char a=Character.toLowerCase(s.charAt(i));
                sb.append(a);
            }
        }
        String s1=sb.toString();
        String s2=sb.reverse().toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}
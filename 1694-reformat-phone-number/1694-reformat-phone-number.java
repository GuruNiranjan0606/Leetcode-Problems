class Solution{
    public String reformatNumber(String nm){
        StringBuilder s = new StringBuilder("");
        for(int i=0; i<nm.length(); i++){
            if(nm.charAt(i)!=' ' && nm.charAt(i)!='-') s.append(nm.charAt(i));
        }
        int n = s.length();

        if(n%3==0){
            StringBuilder ans = new StringBuilder("");
            for(int i=0; i<s.length(); i+=3){
                ans.append(s.substring(i, i+3));
                ans.append("-");
            }
            return ans.substring(0, ans.length()-1).toString();
        }

        else if(n%3==1){
            StringBuilder ans = new StringBuilder("");
            StringBuilder s1 = new StringBuilder("");
            s1.append(s.substring(0, s.length()-4));
            for(int i=0; i<s1.length(); i+=3){
                ans.append(s1.substring(i, i+3));
                ans.append("-");
            }
            ans.append(s.substring(s.length()-4, s.length()-2));
            ans.append("-");
            ans.append(s.substring(s.length()-2));
            return ans.toString();
        }
        
        else if(n%3==2){
            StringBuilder ans = new StringBuilder("");
            StringBuilder s1 = new StringBuilder("");
            s1.append(s.substring(0, s.length()-2));
            for(int i=0; i<s1.length(); i+=3){
                ans.append(s1.substring(i, i+3));
                ans.append("-");
            }
            ans.append(s.substring(s.length()-2));
            return ans.toString();
        }
        return null;
    }
}
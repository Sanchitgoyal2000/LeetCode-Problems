class Solution {                                    // 8 milliseconds code
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
       String s="";
        for(int i=0;i<strs[0].length();i++)
        {
            int h=0;
            char p = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i<strs[j].length()&&strs[j].charAt(i)==p)
                {
                    h=0;
                }
                else
                {
                    return s;
                }
            }
             s=s+p;
        }
        return s;
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) { // 1 milliseconds code
        String str="";
        if(strs==null || strs.length == 0) return str;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i))
                    return strs[0].substring(0,i);
            }
        } return strs[0];
    } 
}
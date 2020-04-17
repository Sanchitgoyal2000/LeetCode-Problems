class Solution {
    public String stringShift(String s, int[][] shift) {
        String ss=s;
        for(int i=0;i<shift.length;i++)
        {
            shift[i][1]=shift[i][1]%s.length();
            if(shift[i][0]==0)
            {
                String w="";
                w=ss.substring(shift[i][1],ss.length());
                String ww="";
                ww=ss.substring(0,shift[i][1]);
                ss="";
                ss=ss+w;
                ss=ss+ww;
            }
            else
            {
                String w="";
                w=ss.substring(ss.length()-shift[i][1],ss.length());
                String ww = "";
                ww=ss.substring(0,ss.length()-shift[i][1]); 
                ss="";
                ss=ss+w;
                ss=ss+ww;
            }                     
        }
                                
        return ss;
    }
}
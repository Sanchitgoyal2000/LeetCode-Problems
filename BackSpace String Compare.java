class Solution 
{
    public boolean backspaceCompare(String S, String T) 
    {
        int p=0,q=0;
        String s="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='#')
            {
                p++;
                if(i+1<S.length()&&S.charAt(i+1)!='#')
                {
                     i++;
                     s="";
                     while(i<S.length()&&i!=S.length()&&S.charAt(i)!='#')
                     {
                        s=s+S.charAt(i);
                        i++;
                     }
                     i--;
                }
            }
        }
         String s1="";
        for(int i=0;i<T.length();i++)
        {
            if(T.0charAt(i)=='#')
            {
                q++;
                if(i+1<T.length()&&T.charAt(i+1)!='#')
                {
                     i++;
                     s1="";
                     while(i<T.length()&&i!=T.length()&&T.charAt(i)!='#')
                     {
                        s1=s1+T.charAt(i);
                        i++;
                     }
                     i--;
                }
            }
        }
        if(s.equals(s1)&&p==q)
        return true;
        return false;
    }
}
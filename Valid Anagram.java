class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;
         char a[]=new char[200];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++)
        {
            a[t.charAt(i)]--;
        }
        for(int i=0;i<s.length();i++)
        {
            if(a[s.charAt(i)]==0)
                continue;
            else
                return false;
        }
        return true;
    }
}
class Solution {      //stringbuilder takes less time as compared to string
    public String countAndSay(int n)
    {
        StringBuilder  s=new StringBuilder("1");
        StringBuilder res=new StringBuilder("1");
        while(n-->1)
        {  
            res=new StringBuilder("");
            char last=s.charAt(0);
            int h=0;
            Integer c=0;
           for(int i=0;i<s.length();i++)
           {
                   if(s.charAt(i)==last)
                    {
                         c++;
                    }
                    else
                    {
                        res=res.append(c);
                            res=res.append(last);
                        last=s.charAt(i);
                        c=1;
                    }
           }
                                 res=res.append(c);
                            res=res.append(last);
           s=res;
        }
        return res.toString();
    }
 }
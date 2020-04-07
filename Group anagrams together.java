class Solution 
{
  public List<List<String>> groupAnagrams(String[] strs) 
    {  
      HashMap<String,ArrayList<String>>hm=new HashMap<>(); //ddh and ill has same ascii value sum
      for(int i=0;i<strs.length;i++)
      {
          char a[]=strs[i].toCharArray();
          Arrays.sort(a);
          String s=new String(a);
          if(hm.containsKey(s))
          {
              hm.get(s).add(strs[i]);
          }
          else
          {
              ArrayList<String>l=new ArrayList<>();
              l.add(strs[i]);
              hm.put(s,l);
          }
      }
       List<List<String>>n=new ArrayList<>();
          for(Map.Entry<String,ArrayList<String>> entry:hm.entrySet())
          {
              n.add(entry.getValue());
          }
      return n;
      
      //cant add ascii values here because ascii value can add up to same sum;
      //   HashMap<Integer,ArrayList<String>>hm=new HashMap<>();
      //   List<List<String>>n=new ArrayList<>();
      //   for(int i=0;i<strs.length;i++)
      //   {
      //       int s=0;
      //       for(int j=0;j<strs[i].length();j++)
      //       {
      //           s=s+strs[i].charAt(j);
      //       }
      //       if(hm.containsKey(s))
      //       {
      //           hm.get(s).add(strs[i]);
      //       }
      //       else
      //       {
      //           ArrayList<String>l=new ArrayList<>();
      //           l.add(strs[i]);
      //           hm.put(s,l);
      //       }
      //   }
      // System.out.println(hm.size()+" "+strs.length);
      //    for (Map.Entry<Integer,ArrayList<String>> entry:hm.entrySet()) 
      //    {}
      //       n.add(entry.getValue());
      //    }
      //   return n;
    }
}
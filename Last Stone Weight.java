class Solution {
    public int lastStoneWeight(int[] a) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            l.add(a[i]);
        }
        Collections.sort(l);
       while(l.size()>1)
       {
           int ll=l.size()-1;
               Integer p=l.get(ll)-l.get(ll-1);
               l.remove(ll);
               l.remove(ll-1);
               l.add(p);
               Collections.sort(l);
       }
        return l.get(0);
       }
}
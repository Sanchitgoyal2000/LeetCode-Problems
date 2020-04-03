import java.util.*;
class SnapshotArray 
{
    ArrayList<HashMap<Integer,Integer>> l =new ArrayList<>();
    HashMap<Integer,Integer>hm=new HashMap<>();
    int c=0;
    public SnapshotArray(int length)
    {
       l.add(hm);
    }
                                                 
    public void set(int index, int val) {
    
              l.get(c).put(index,val);
    }
    
    public int snap() 
    {
       c++;
       hm=new HashMap();
       l.add(hm);
       return c-1;
    }
    
    public int get(int index, int snap_id) {
        for(int i=snap_id;i>=0;i--)
        {
        if(l.get(i).containsKey(index))
            return l.get(i).get(index);
        }
        return 0;
    }
}
//if we do l.add(hm) and again we do canges in hm then changes
will be reflected in l.get(0) also.

class Solution {
    public boolean canJump(int[] a) {
        int max=0;
        if(a[0]==0)
        {
            if(a.length>1)              //   [0]
            return false;
            return true;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                if(i!=a.length-1&&max<=i)     //    [2,0,0]
                    return false;
            }
            else if(i+a[i]>max)
            {
                max=i+a[i];
            }
        }
        if(max>=a.length-1)
            return true;
        return false;
    }
}
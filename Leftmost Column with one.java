/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix b)
    {
        List<Integer>l=b.dimensions();
        int r=l.get(0),c=l.get(1);
        int result = -1;
        int rr=0,cc=c-1;
        while(rr<r&&cc>=0)
        {
            if(b.get(rr,cc)==1)
            {
                result = cc;
                cc--;
            }
            else
            {
                rr++;
            }
        }
        return result;
    }
}

class Solution 
{
    public boolean isValidSequence(TreeNode root, int[] arr)
    {
        return valid(root,arr,0);
    }
    
    boolean valid(TreeNode root,int []a,int i)
    {
        if(i>=a.length||root==null)
            return false;
       if(root.left==null&&root.right==null)
       {
           if(i==a.length-1&&root.val==a[i])
           {
               return true;
           }
           return false;
       }
        boolean p=false;;
        if(a[i]==root.val)
        p=valid(root.left,a,i+1);
        if(p==true)
            return true;
        if(a[i]==root.val)
        p=valid(root.right,a,i+1);
        if(p==true)
            return true;
        
        return false;
    }
}
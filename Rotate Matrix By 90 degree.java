class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
           for(int j=i;j<matrix.length;j++)
            {
                int t=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=t;
            }
        }
        int p=matrix.length-1;
        for(int j=0;j<matrix.length/2;j++)
        {
         for(int i=0;i<matrix.length;i++)
          {
            int t=matrix[i][j];
            matrix[i][j]=matrix[i][p];
            matrix[i][p]=t;
          }
            p--;
        }
}
}
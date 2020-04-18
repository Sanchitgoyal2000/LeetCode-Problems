class Solution {
    public int countPrimes(int n) {
        boolean a[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            a[i]=true;
        }
        for(int i=2;i*i<n;i++)             // i*i decrease time complexity here
        {
            if(a[i]==true)
            {
                 boolean p=check(i);
                if(p==true)                //if number is prime then its multiples cannot be prime
                {
                    for(int j=i*i;j<n;j=j+i)    //j=j+i plays an important step     
                    {
                            a[j]=false;
                    }
                }
                else
                {
                    a[i]=false;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(a[i]==true)
                c++;
        }
        return c;
    }
    boolean check(int n)
    {
        if(n==2)
            return true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
		//code
		int t;
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		while(t-->0)
		{
		    int n,m;
		    n=ob.nextInt();
		    m=ob.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=ob.nextInt();
		    }
		  HashMap<Integer,Integer>hm=new HashMap<>();
		  int sum=0,h=0;
		  for(int i=0;i<n;i++)
		  {
		      sum=sum+a[i];
		      if(sum==m)
		      {
		          h=1;
		           System.out.println("1"+" "+(i+1));
		           break;
		      }
		      if(hm.containsKey(sum-m))
		      {
		          h=1;
		          System.out.println(hm.get(sum-m)+1+" "+(i+1));
		          break;
		      }
		      hm.put(sum,i+1);
		  }
		  if(h==0)
		  System.out.println("-1");
		}
	}
}
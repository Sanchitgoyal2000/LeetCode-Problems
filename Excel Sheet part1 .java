/*package whatever //do not write package name here */

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
		    int n;
		    n=ob.nextInt();
		    StringBuilder s=new StringBuilder("");
		    while(n>0)
		    {
		        int p=n%26;
		        if(p==0)
		        {
		            s.append('Z');
		            n=(n/26)-1;
		        }
		        else
		        {
		             s.append((char)(p-1+'A'));
		             n=(n/26);
		        }
		    }
		    System.out.println(s.reverse());
		}
	}
}
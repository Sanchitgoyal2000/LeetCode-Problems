/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
	public static void main (String[] args) {
		//code
		int t;
		Scanner ob=new Scanner(System.in);
		t=ob.nextInt();
		while(t-->0)
		{
		    String s;
		    s=ob.next();
		    int ss=0;
		    for(int i=0;i<s.length();i++)
		    {
		        ss=ss*26+(s.charAt(i)-'A'+1);
		    }
		    System.out.println(ss);
		}
	}
}
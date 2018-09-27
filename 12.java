import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		for(int i=0;i<k;i++)
		{
			int t=a[n-1];
			for(int j=n-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=t;
			
		}
		System.out.print(a[0]);
		for(int i=1;i<n;i++)
		System.out.print(" "+a[i]);

	}
}

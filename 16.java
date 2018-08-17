import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		num[i]=s.nextInt();
		int temp=0;
		for(int i=0;i<n;i++)
		{
			int cnt=0;
			for(int j=0;j<n;j++)
			{
				if(num[i]==num[j])
				cnt++;
			}
			if(cnt==0)
			temp=num[i];
		}
		System.out.print(temp);
		
		
	}
}

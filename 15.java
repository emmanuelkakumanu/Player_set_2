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
		String str=s.nextLine();
		int max=0,ind=0;
		for(int i=0;i<str.length()-1;i++)
		{
			int cnt=0;
			char c=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				char c1=str.charAt(j);
				if(c==c1)
				{
					cnt++;
				}
			}
			if(cnt>max)
			{
				max=cnt;
				ind=i;
			}
		}
		System.out.print(str.charAt(ind));
	}
}

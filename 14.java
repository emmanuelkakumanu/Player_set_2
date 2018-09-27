
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
		char t[]=new char[str.length()];
		int k=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
			{
				t[k++]=ch;
			}
		}
		for(int i=0;i<k;i++)
		System.out.print(t[i]);

	}
}

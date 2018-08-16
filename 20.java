import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			int c=(int)ch[i]+3;
			ch[i]=(char)c;
		}
		for(int i=0;i<str.length();i++)
		System.out.print(ch[i]);
		
	}
}

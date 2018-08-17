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
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=s.nextLine();
		}
		System.out.print(str[2]);
		String k="kabali";
		char kc[]=k.toCharArray();
		int cnt=0;
		for(int i=0;i<n;i++)
		{
			char ch[]=new char[str[i].length()];
			ch=str[i].toLowerCase().toCharArray();
			if(Arrays.equals(kc,ch))
			{
			cnt++;
			}
			
			
			
		}
		System.out.print(cnt);
		
		
	}
}

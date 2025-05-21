import java.io.*;
import java.util.*;
class File2
{
	public static void main(String args[])
	{

		try
		{
			FileReader f1=new FileReader("File1.txt");
			FileWriter f2=new FileWriter("File2.txt");
			FileWriter f3=new FileWriter("File3.txt");
			Scanner sc=new Scanner(f1);
			String s=sc.nextLine();
			StringTokenizer st=new StringTokenizer(s,",");
			int i;
			while(st.hasMoreTokens())
			{
				String str=st.nextToken();		
				i=Integer.parseInt(str);
				if(i%2==0)
				{
					f2.write(str);
				}
				else
				{
					f3.write(str);
				}
			}
			f1.close();
			f2.close();
			f3.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}

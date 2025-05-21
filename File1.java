import java.io.*;
import java.util.*;
class File1{
public static void main(String args[])
{
try
{
FileReader f1=new FileReader("File1.txt");
FileWriter f2=new FileWriter("Even.txt");
FileWriter f3=new FileWriter("Odd.txt");
int i;
while((i=f1.read())!=-1)
{
if((i%2)==0)
{
f2.write(i);
}
else
{

f3.write(i);
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

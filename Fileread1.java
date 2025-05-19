import java.io.*;
class Fileread1{
public static void main(String args[])
{
try
{
FileReader f1=new FileReader("File1.txt");
FileWriter f2=new FileWriter("File2.txt");
int i;
while((i=f1.read())!=-1)
{
f2.write(i);
}
f1.close();
f2.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}

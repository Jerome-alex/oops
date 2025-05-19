import java.io.*;
import java.util.*;
class Fileread2{
public static void main(String args[])
{
try
{
FileWriter f1=new FileWriter("File3.txt");
FileReader f2=new FileReader("File3.txt");

Scanner sc=new Scanner(System.in);
System.out.println("enter the text");
String a=sc.nextLine();
f1.write(a);
f1.close();
int i;
while((i=f2.read())!=-1)
{
System.out.print((char)i);
}
f2.close();
}
catch(IOException e)
{
System.out.println(e);
}
}
}

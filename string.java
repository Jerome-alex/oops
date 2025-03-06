import java.util.*;
class string{
public static void main(String args[])
{
String a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter a String1");
a=sc.nextLine();
System.out.println("enter a String2");
b=sc.nextLine();
System.out.print("Lowercase:");
System.out.println(a.toLowerCase());
System.out.print("Uppercase:");
System.out.println(a.toUpperCase());
System.out.print("Substring:");
System.out.println(a.substring(1,5));
System.out.print("Length of the string1:");
System.out.println(a.length());
System.out.print("Concatenate of two strings:");
System.out.println(a.concat(b));
}
}

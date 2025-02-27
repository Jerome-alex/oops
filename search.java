import java.util.*;
class search{
public static void main(String args[])
{
int n,x,i,flag=0;
int a[]=new int[20];
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
n=sc.nextInt();
System.out.println("Enter the array elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("The array elements are:");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println();

System.out.println("enter the element to search");
x=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
flag=1;
break;
}
else
{
flag=0;
}
}
if(flag==1)
{
System.out.println("element found at position"+(i+1));
}
else
{
System.out.println("element not found!!!");
}
}
}

import java.util.*;
class Sym{
public static void main(String args[])
{
int m,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the no of rows");
m=s.nextInt();
System.out.println("enter the no of columns");
n=s.nextInt();
int a[][]=new int[m][n];
System.out.println("enter the elements");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("the transpose matrix");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println(" ");
}
if(m!=n)
{
System.out.println("it is not a square matrix,so it is not be symmetric");
}
else
{
boolean symmetric=true;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(a[i][j]!=a[j][i])
{
symmetric=false;
break;
}
}
}
if(symmetric)
{
System.out.println("symmetric");
}
else
{
System.out.println("not symmetric");
}
}
s.close();
}
}

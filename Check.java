import java.util.*;
class EvenException extends ArithmeticException{
EvenException(String s){
super(s);
}
}
class OddException extends ArithmeticException{
OddException(String s1){
super(s1);
}
}
class Check{
static void even(int n) throws EvenException,OddException{
if((n%2)==0)
{
throw new EvenException("no is even");
}
else
{
throw new OddException("no is odd");
}
}

public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
n = sc.nextInt();
try {
       even(n); 
} 
catch (EvenException e)
{
  System.out.println(e); 
   }
catch (OddException e)
{
  System.out.println(e); 
   }  
  }
}

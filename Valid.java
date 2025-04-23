import java.util.*;
class Valid {
static void checkAge(int n)throws ArithmeticException {
if (n < 18) {
 throw new ArithmeticException("Invalid age");
 } 
 else 
 {
   System.out.println("Access granted");
      }
    }
    

public static void main(String args[]) {
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age: ");
n = sc.nextInt();

try {
       checkAge(n); 
} 
catch (ArithmeticException e)
{
  System.out.println(e); 
   }
  }
}

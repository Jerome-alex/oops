import java.util.*;
class Negative extends ArithmeticException {
    Negative(String s) {
        super(s);
    }
}

class Average {
    static void check(int num) throws Negative {
    int n,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements: ");
    for(int i=0;i<num;i++){
    n=sc.nextInt();
    if (n < 0) {
  throw new Negative("Number is negative: " + num);
  } 
  sum+=n;
    }
   double avg=(double)sum/num;     
System.out.println("Average of positive numbers: " + avg);
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ");
        int num = sc.nextInt();
          try {
                check(num);
               
            } 
                
         catch (Negative e) {
                System.out.println(e);
            }
        

        System.out.println("program terminated");

    }
}


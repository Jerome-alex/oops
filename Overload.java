import java.util.*;

class Shapes {
    int l, b;  
    int r;     
    int s;    

    
    void area(int l, int b) {
        this.l = l;
        this.b = b;
        int area = l * b;
        System.out.println("Area of rectangle is: " + area);
    }

    
    void area(double r) {
        this.r = (int) r;  
        double area = 3.14 * r * r;
        System.out.println("Area of the circle is: " + area);
    }

    
    void area(int s) {
        this.s = s;  
        int area = s * s;
        System.out.println("Area of the square is: " + area);
    }
}

class Overload {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        
       
        Shapes shape = new Shapes();
        shape.area(l, b);  
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();  
        shape.area(r);  
        System.out.println("Enter the side of the square: ");
        int s = sc.nextInt();
        shape.area(s);  
    }
}


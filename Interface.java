import java.util.*;
interface Shape{
void area();
void perimeter();
}
class Circle implements Shape{
int r;
Circle(int r){
this.r=r;
}
public void area(){
double area=3.14*r*r;
System.out.println("area of circle is="+area);
}
public void perimeter(){
double peri=2*3.14*r;
System.out.println("Perimeter of the circle="+peri);
}
}
class Rectangle implements Shape{
int l;
int b;
Rectangle(int l,int b){
this.l=l;
this.b=b;
}
public void area(){
int area=l*b;
System.out.println("area of rectangle="+area);
}
public void perimeter(){
int peri=2*(l+b);
System.out.println("perimeter of rectangle="+peri);
}
}
class Interface{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch;
        do {
            System.out.println("Enter your choice:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:                
                    System.out.println("Enter the radius of the circle:");
                    int radius = sc.nextInt();
                    Circle circle = new Circle(radius);
                    circle.area();
                    circle.perimeter();
                    break;

                case 2:          
                    System.out.println("Enter the length of the rectangle:");
                    int length = sc.nextInt();
                    System.out.println("Enter the breadth of the rectangle:");
                    int breadth = sc.nextInt();
                    Rectangle rectangle = new Rectangle(length, breadth);
                    rectangle.area();
                    rectangle.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                    break;
            }
        } while (ch != 3);

        sc.close();
    }
}

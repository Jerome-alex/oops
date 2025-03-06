import java.util.*;

class Employee{
int eNo;
String eName;
int eSalary;

Employee(int eNo, String eName, int eSalary){
this.eNo = eNo;
this.eName = eName;
this.eSalary = eSalary;
}

void display(){
System.out.println("Employee no : " + eNo);
System.out.println("Employee name : " + eName);
System.out.println("Employee Salary : " + eSalary);
}
}

public class EmployeeDemo{
public static void main(String args[]){

int flag = 0;

Scanner sc = new Scanner(System.in);
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter the no: of Employee you want to enter");
int n = sc.nextInt();
Employee[] employee = new Employee[n];

for(int i = 0; i < n; i++){
System.out.println("Enter name of the employee : ");
String eName = sc1.nextLine();
System.out.println("Enter id of the employee : ");
int eNo = sc.nextInt();
System.out.println("Enter Salary of the employee : ");
int eSalary = sc.nextInt();

employee[i] = new Employee(eNo, eName, eSalary);
}

System.out.println("Enter id of the employee to Search : ");
int id = sc.nextInt();

for(int i = 0; i < n; i++){
if(employee[i].eNo == id){
employee[i].display();
flag = 1;
break;
} else {
continue;
}
}

if(flag == 0){
System.out.println("Employee not found!");
}
}
}

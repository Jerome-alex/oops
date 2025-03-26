import java.util.*;

class Employee {
    int emp_id;
    String emp_name;
    int emp_salary;
    String address;

    
    Employee(int emp_id, String emp_name, int emp_salary, String address) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
        this.address = address;
    }

    
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Salary: " + emp_salary);
        System.out.println("Employee Address: " + address);
    }
}


class Teacher extends Employee {
    String depart;
    String subject;

    
    Teacher(int emp_id, String emp_name, int emp_salary, String address, String depart, String subject) {
        
        super(emp_id, emp_name, emp_salary, address);
        this.depart = depart;
        this.subject = subject;
    }

    
    void display() {
        displayEmployeeDetails();  
        System.out.println("Department: " + depart);
        System.out.println("Subject: " + subject);
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number of teachers: ");
        int n = sc.nextInt();

        
        Employee[] employee = new Employee[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of the employee: ");
            String emp_name = sc1.nextLine();
            System.out.println("Enter ID of the employee: ");
            int emp_id = sc.nextInt();
            System.out.println("Enter Salary of the employee: ");
            int emp_salary = sc.nextInt();
            System.out.println("Enter the address of the employee: ");
            sc1.nextLine();  
            String address = sc1.nextLine();
            System.out.println("Enter the department of the employee: ");
            String depart = sc1.nextLine();
            System.out.println("Enter the subject of the employee: ");
            String subject = sc1.nextLine();

            
            employee[i] = new Teacher(emp_id, emp_name, emp_salary, address, depart, subject);
        }

       
        System.out.println("Enter ID of the employee to Search: ");
        int id = sc.nextInt();

        boolean flag = false; 

        
        for (int i = 0; i < n; i++) {
            if (employee[i].emp_id == id) {
                ((Teacher) employee[i]).display();
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Employee not found!");
        }

        sc.close();
        sc1.close();
    }
}


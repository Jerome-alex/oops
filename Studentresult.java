import java.util.*;

interface Sports {
    void sportsGetData();
    void sportsDispData();
}

class Student {
    String name;
    int rollno;
    int s1, s2;

    Student(String name, int rollno, int s1, int s2) {
        this.name = name;
        this.rollno = rollno;
        this.s1 = s1;
        this.s2 = s2;
    }
}

class Result extends Student implements Sports {
    int rank;
    String item;

    Result(String name, int rollno, int s1, int s2, int rank, String item) {
        super(name, rollno, s1, s2);
        this.rank = rank;
        this.item = item;
    }

    void academic() {
        int score = s1 + s2;
        int total = 200; 
        double per = (score / (double) total) * 100; 
        System.out.println("Percentage: " + per);
    }


    public void sportsGetData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rank:");
        rank = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter the item:");
        item = sc.nextLine();
    }

    public void sportsDispData() {
        System.out.println("The rank is: " + rank);
        System.out.println("The item is: " + item);
    }
}

public class Studentresult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();

        System.out.println("Enter the roll number:");
        int rollno = sc.nextInt();

        System.out.println("Enter the academic score:");
        int s1 = sc.nextInt();

        System.out.println("Enter the sports score:");
        int s2 = sc.nextInt();

        Result result = new Result(name, rollno, s1, s2, 0, "");
        result.sportsGetData();  
        result.academic();       
        result.sportsDispData(); 
    }
}


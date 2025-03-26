import java.util.*;
class Publisher {
    String p_name;
    String a_name;

    Publisher(String p_name, String a_name) {
        this.p_name = p_name;
        this.a_name = a_name;
    }
}

class Book extends Publisher {
    String b_name;
    String author;
    int price;
    String type;


    Book(String p_name, String a_name, String b_name, String author, int price, String type) {
        super(p_name, a_name); 
        this.b_name = b_name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
}

class Literature extends Book {

    Literature(String p_name, String a_name, String b_name, String author, int price, String type) {
        super(p_name, a_name, b_name, author, price, type); 
    }

    void display() {
        System.out.println("Publisher Name: " + p_name);
        System.out.println("Author Name: " + a_name);
        System.out.println("Book Name: " + b_name);
        System.out.println("Author of the Book: " + author);
        System.out.println("Price of the Book: " + price);
        System.out.println("Type of the Book: " + type);
    }
}

class Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter publisher name: ");
        String p_name = sc.nextLine();
        System.out.println("Enter author name: ");
        String a_name = sc.nextLine();
        System.out.println("Enter book name: ");
        String b_name = sc.nextLine();
        System.out.println("Enter author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter price of the book: ");
        int price = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter type of the book (e.g., Fiction, Non-Fiction, etc.): ");
        String type = sc.nextLine();

        Literature literature = new Literature(p_name, a_name, b_name, author, price, type);
        literature.display();
    }
}


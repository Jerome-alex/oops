import java.util.*;
class NameException extends NullPointerException {
    public NameException(String s) {
        super(s);
    }
}
class PasswordException extends NullPointerException{
PasswordException(String s1){
super(s1);
}
}
class Authenticate {

    static void validatename(String name) throws NameException{
    
        if (name.length() <= 6) {
       
            throw new NameException("Name must be longer than 6 characters.");
        }
        }
    static void invalidpass(String pass) throws PasswordException{
    String password="hello@123";
        if(password!=pass)
        {
        throw new PasswordException("Invalid password");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        

        try {
            validatename(name);
            try{
            System.out.print("Enter your password: ");
        String pass = sc.nextLine();
            invalidpass(pass);
        } 
        catch (PasswordException e) {
            System.out.println(e);
        }
        
        }
       
        catch (NameException e) {
            System.out.println(e);
        
        }
        
    }
}


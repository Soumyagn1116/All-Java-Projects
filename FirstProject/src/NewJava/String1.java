package NewJava;
import java.lang.*;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		//concatenation User Register System
		Scanner obj = new Scanner(System.in);  // give the dynamic input by user.input by user
        System.out.println("Enter the First name: ");
        String firstName=obj.nextLine();
        
        System.out.println("Enter the second name: ");
        String SecondName=obj.nextLine();
        
        System.out.println("Enter the email : ");
        String email = obj.nextLine();
        
        String Welcome = "Welcome "+ firstName + " " + SecondName +" "+ " Your email is " + email ;
        String Welcome2 = "Welcome, " .concat(firstName).concat(" ").concat(SecondName).concat("Your email is ").concat(email);
        System.out.println(Welcome);
        System.out.println(Welcome2);
        }

}
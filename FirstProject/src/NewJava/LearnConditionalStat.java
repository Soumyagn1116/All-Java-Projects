package NewJava;

import java.util.Scanner;

public class LearnConditionalStat {

	public static void main(String[] args) {
		// is Statement - one single condition - ATM
		
		int enterPIN = 1234;
		int correctPIN = 3234;
		
		if (enterPIN == correctPIN) {
			System.out.println("Access Granted");
		}else {
			System.out.println("Enter the correct Password");
		}

		//Nestif - student Passmark
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		
		int marks=obj.nextInt();
		
		if(marks >=40){
			if(marks >=90) {
				System.out.println("Grade A");	
			}
			else if (marks>=75){
				System.out.println("Grade B");
			
			}else {
				System.out.println("Grade c");
			}
			
		}else {
			System.out.println("Fail");
		}
		
		//switch statement - tea making
		
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter your Choice");
		
		int choice = obj1.nextInt();
		
		switch(choice) {
		case 1: System.out.println("Enter your tea");
		break;
		case 2: System.out.println("Enter your coffee");
		break;
		case 3: System.out.println("Enter your Water");
		break;
		default:
			System.out.println("Invalid selection");
			
		}
	}

}

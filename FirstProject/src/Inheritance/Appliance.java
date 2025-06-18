package Inheritance;

import java.util.Scanner;
public class Appliance {
	
	void plugIn(){
		System.out.println("Appliance is Plugged in.");
	}
}
   
class WashingMachine extends Appliance {
	void startWashCycle() {
		System.out.println("washing cycle started.");

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		WashingMachine wm = new WashingMachine();
		
		System.out.println("Do you want to plug in the machine? (yes/no): ");
		String input = scanner.nextLine();
		
		if(input.equalsIgnoreCase("yes")) {
			wm.plugIn();
		}
		
		System.out.println("Start washing cycle? (yes/no): ");
		input = scanner.nextLine();
		
		if (input.equalsIgnoreCase("yes")) {
			wm.startWashCycle();
		}
		
		scanner.close();
		}
	}

package Inheritance;

import java.util.Scanner;

public class Book {
	
	String title;
	
	void read() {
		System.out.println("Reading: "+ title);
		
	}
	
}
class Ebook extends Book{
	void download() {
		System.out.println("Ebook \""+title+"\" downloaded.");
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ebook ebook = new Ebook();
		
		System.out.println("Enter the title of the ebook: ");
		ebook.title = scanner.nextLine();
		
		ebook.download();
		ebook.read();
		
		scanner.close();
		}

	}


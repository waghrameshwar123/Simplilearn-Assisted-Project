package com;
import java.util.*;

public class MainMenu {

	public static void main(String[] args) {
		char choice;
		boolean running = true;
		Welcome.printWelcomeScreen();
		do {
	    try (Scanner sc = new Scanner(System.in)) {
			
				Welcome.displayMenu();
				System.out.print("Enter your choice : ");
				choice=sc.next().charAt(0);
				try {
					switch (choice) {
					case '1':
						FileOperations.displayAllFiles("main");
						break;
					case '2':
						FileOption.handleFileMenuOptions();
						break;
					case '3':
						System.out.println("Program exited successfully.");
						running = false;
						sc.close();
						System.exit(0);
						break;

					default:
						System.out.println("Please select a valid option from above.");
						
					}
				}catch (Exception e) {
					//System.out.println(e.getClass().getName());
					
				}
			}
		}while (running == true);
	    

}
}


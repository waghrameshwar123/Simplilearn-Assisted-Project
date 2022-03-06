package com;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class LockedMe {

	public static void main(String[] args) throws IOException {
		String companyDetails = String.format("\n**** Welcome to LockedMe.com ***** \n" + "This application was developed by Rameshwar Waghmare");
		System.out.println(companyDetails);
		
		choiceSelect();
	}
		private static void choiceSelect() throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\n------------Main Menu-----------");
			System.out.println("\n"+"Enter 1 to Retrieve  the File names :");
			System.out.println("Enter 2 to ADD , DELETE , SEARCH file");
			System.out.println("Enter 3 to close Your Application");
			System.out.println("\nEnter your Choice");
			int choose = sc.nextInt();
			switch(choose){
			
			case 1:
				String Filedirectory = "D:\\Assisted Project\\Locked Me\\Main\\";
				File file1 = new File(Filedirectory);
				int count =1;
				String listOfFile[] = file1.list();
				
				for(String name : listOfFile)
				{
					System.out.println(count +")"+ name);
					count ++;
				} 
				choiceSelect();
				break;
				
			case 2:
			choiceSelection();
			choiceSelect();
			
			case 3:
				System.out.println("Closing your Application");
				System.exit(choose);
			
			default:
				System.out.println("Please select a valid option.");
				choiceSelect();

			}
		}
    }
		
		private static void choiceSelection() throws IOException {
		
		String Filedirectory = "D:\\Assisted Project\\Locked Me\\Main\\";
		File file = new File(Filedirectory);
		
	
		System.out.println("\nEnter 1 to Add a File :");
		System.out.println("Enter 2 to Delete a File  :");
		System.out.println("Enter 3 to Search a File  :");
		System.out.println("Enter 4 to go back :");
		
			
			System.out.println("\nEnter your choice :");
			try (Scanner sc = new Scanner(System.in)) {
				int choice = sc.nextInt();
				
				switch(choice)
				{
				
					
					
				case 1:
					 
						Scanner input = new Scanner(System.in);
				        System.out.print("Enter the File name you want to create: ");
				        String fileName = input.nextLine();
				        fileName = fileName + ".txt";
				        File file1 = new File(Filedirectory+fileName);
				        
				        	if (file1.createNewFile()) 
				        	{  
				        		System.out.println("New File is created!");  
				        	} 
				        	else
				        	{
				        		System.out.println("File already Exist");
				        	}
				    choiceSelection();
					break;
					
				case 2:
					
						Scanner input1 = new Scanner(System.in);
						System.out.println("Enter the file name you want to Delete: ");
						String deletefilename = input1.nextLine();
						deletefilename = deletefilename+".txt";
						File file11 = new File(Filedirectory+deletefilename);
						boolean b = file11.delete();
						
				        if(b==true)
				        {
				        	System.out.println("File deleted !!");
				        }
				        else
				        {
				        	System.out.println("File not Found and File not deleted");
				        }
						
				        choiceSelection();
					break;
					
					
				case 3:
					
						Scanner inp = new Scanner(System.in);
						System.out.println("Enter the file name you want to Search: ");
						String filename = inp.nextLine();
						filename = filename+".txt";
						File searchfilename = new File(Filedirectory+filename);
						boolean exists = searchfilename.exists();
						
						if (exists) 
						{
							System.out.println("File Found.");
						}
						else
						{
							System.out.println("File not found.");
						}
						
						choiceSelection();
						break ;
					
						
				case 4:
				
					System.out.println("Goining back to Main Menu");
					choiceSelect();
					System.exit(choice);
				
				default:
					
					System.out.println("You have enter Wrong value");
					choiceSelection();
					
}
			}
}
}

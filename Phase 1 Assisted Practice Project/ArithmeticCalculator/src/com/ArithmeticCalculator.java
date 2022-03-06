package com;
import java.util.*;


public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		double a;
	    double b;
	    double res;
	    char choice;
	    try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n");
				System.out.print("Enter your choice : ");
				choice=sc.next().charAt(0);
			try {
				switch(choice)
				{ 
				    case '1':System.out.print("Enter two numbers : ");
				    a=sc.nextDouble();
				    b=sc.nextDouble();	
				    res=a+b;
				    System.out.print("Result : " +res);
				    break;
				     
				     case '2':System.out.print("Enter two numbers : ");
				     a=sc.nextDouble();
					 b=sc.nextDouble();	
					 res=a-b;
					 System.out.print("Result : " +res);
					 break;
					    
				     case '3':System.out.print("Enter two numbers : ");
				     a=sc.nextDouble();
					 b=sc.nextDouble();
					 if(b==0)
						 System.out.println("Error!!! In Division denominator cannot be 0!");
					 else {
					 res=a/b;
					 System.out.print("Result : " +res);
					 }
					 break;
					    
				     case '4':System.out.print("Enter two numbers : ");
				     a=sc.nextDouble();
					 b=sc.nextDouble();
					 res=a*b;
					 System.out.print("Result : " +res);
					 break;
					   
				     case '5':System.out.println("--Exit--");
					 System.exit(0);
					 break;
					 default : System.out.print("Wrong Choice.....\n");
					 break;
			}
				
				
			}catch (Exception e) {
			    System.out.println("The Exception is : " +e);
			    System.out.println("Run Program Again");
			    break;
			
			}
			}while(choice!=5);
		}   
	}	
}

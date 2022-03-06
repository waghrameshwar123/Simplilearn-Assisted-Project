package com;
import java.util.*;

	public class SearchStringArray {

		public static void main(String args[])
		 {
		 Scanner sc = new Scanner(System.in);
		 
		     int i,n,flag=0;
			String search;
			
		 System.out.println("Enter the number of elements:") ;
		 n = sc.nextInt();
		 String[] str = new String[n];
		 
		     System.out.println("Enter the elements") ;
		     for(i=0;i<n;i++)
		     {
		    	 String s = sc.nextLine();
		         str[i] = s;
		     }
		 
		 System.out.println("Enter the element to be searched");
		 search = sc.nextLine();
		 for (String A : str)
		     if(search == str[n]) {
		    	 System.out.println(search + " is found.");
		     }
		     else {
		    	 System.out.println(search + " is not found.");
		     }
		}
	}
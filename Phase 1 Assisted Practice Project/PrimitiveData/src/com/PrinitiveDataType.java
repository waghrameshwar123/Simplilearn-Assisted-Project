package com;
import java.util.*;

public class PrinitiveDataType {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String: ");
			String str = sc.nextLine();
			System.out.println("Entered String : "+str);
			
			int b = Integer.parseInt(str);
			double c = Double.parseDouble(str);
			long d = Long.parseLong(str);
			//boolean e = Boolean.parseBoolean(str);
			
			
			System.out.println("Integer "+b);
			System.out.println("Double :"+c);
			System.out.println("Long :"+d);
			//System.out.println("Boolean :"+e);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		
	
	}

}

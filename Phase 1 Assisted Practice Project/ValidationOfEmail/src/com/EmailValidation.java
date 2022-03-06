package com;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmailValidation {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String pattern ="[a-z,A-Z,0-9]+@[a-z]+\\.com";
			System.out.println("Enter Email id :");
			String name = sc.nextLine();
			
//    String name ="a@b.com";
			Pattern pt  = Pattern.compile(pattern);	
			Matcher mt  = pt.matcher(name);		
			if(mt.matches()) {
				System.out.println("Valid Email");
			}else {
				System.out.println("Invalid Email");
			}
		}

	}

}

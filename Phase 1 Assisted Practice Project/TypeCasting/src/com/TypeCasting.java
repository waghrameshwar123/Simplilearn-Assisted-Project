package com;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("Implicit Casting");//casting is done automatically when passing a smaller size type to a larger size type
		char a='R';
		int b=a;
		float c=a;
		long d=a;
		double e=a;
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of a: "+b);
		System.out.println("Value of a: "+c);
		System.out.println("Value of a: "+d);
		System.out.println("Value of a: "+e);
		System.out.println("\n");
		
		
		System.out.println("Explicit Casting");// casting must be done manually by placing the type in parentheses in front of the value
		double x=10.12;
		int y= (int)x;
		
		System.out.println("Value of a: "+x);
		System.out.println("Value of a: "+y);
		
	}

}
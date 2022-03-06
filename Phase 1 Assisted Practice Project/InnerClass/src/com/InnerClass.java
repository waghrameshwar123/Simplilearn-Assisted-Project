package com;

public class InnerClass {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", Let us start learning Inner Classes");
		  }  
	 }
	 
	 void display(){  
		 class InClass{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  InClass l=new InClass();  
	  l.msg();  
	 }  



	public static void main(String[] args) {

		InnerClass obj=new InnerClass();
		InnerClass.Inner in=obj.new Inner();  
		in.hello(); 
		
		obj.display();  
	}
}

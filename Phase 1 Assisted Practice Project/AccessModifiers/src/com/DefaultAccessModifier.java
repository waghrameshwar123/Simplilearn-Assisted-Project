package com;

class A 
{ 
    void display()      //no access modifier indicates default modifier
       { 
           System.out.println("Default Access Modifier"); 
       } 
}

public class DefaultAccessModifier {

	public static void main(String[] args) {
		A obj = new A(); 
		   
        obj.display();
	}

}

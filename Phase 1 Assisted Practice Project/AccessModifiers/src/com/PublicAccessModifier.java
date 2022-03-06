package com;

class B{
	
   public void display() 
      { 
          System.out.println("Public Access Modifier"); 
      } 
} 
public class PublicAccessModifier { 
    public static void main(String args[]) 
      { 
          B obj = new B(); 
          obj.display(); 
      } 
}
package com;

class C 
{ 
   protected void display() 
    { 
        System.out.println("Protected Access Modifier"); 
    } 
} 
 
class D extends C {}  
class E extends D {}
 
public class ProtectedAccessModifier{
     public static void main(String args[]) 
   {   
       C obj = new C();     //create object of class B   
       obj.display();       //access class A protected method using obj
       D Obj1 = new D();    //create object of class C
       Obj1.display ();     //access class A protected method using cObj
   }   
}
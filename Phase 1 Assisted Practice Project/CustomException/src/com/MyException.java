package com;

class MyExcept extends Exception 
{ 
    public MyExcept(String s) 
    { 
        super(s); 
    } 
} 
public class MyException{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyExcept("temp"); 
        } 
        catch (MyExcept ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}

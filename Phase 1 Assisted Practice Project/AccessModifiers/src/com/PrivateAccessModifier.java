package com;

class Data {
    private String strname;    
 
// getter method
    public String getName() {
        return this.strname;
    }
    // setter method
    public void setName(String name) {
        this.strname= name;
    }
}
public class PrivateAccessModifier {
    public static void main(String[] main){
        Data d = new Data();       
 
 // access the private variable using the getter and setter
        d.setName("Private Access Modifier");
        System.out.println(d.getName());
    }
}
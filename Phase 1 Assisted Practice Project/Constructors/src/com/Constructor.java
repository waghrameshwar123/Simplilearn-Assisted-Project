package com;

//default constructor
class StudentInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class Constructor {

public static void main(String[] args) {

	StudentInfo info1=new StudentInfo();
	StudentInfo info2=new StudentInfo();

	info1.display();
	info2.display();
	
	
	Std std1=new Std(4,"Ram");
	Std std2=new Std(6,"Radhe");
	std1.display();
	std2.display();

	}
}

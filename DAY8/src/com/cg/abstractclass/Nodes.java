package com.cg.abstractclass;

public abstract class Nodes {
	//constructors
	public Nodes() {
		
	}
	
	//non-abstract method
	void display() {
		System.out.println("Display");
		}
	
	//abstract method
	 abstract void show(); 
		

	//Abstract class
	//1. abstract keyword
	//2. variables + methods +constructors
	//2. methods = abstract method + non abstract method 
	 //3. if abstract method is present in a class then it is mandatory that class as abstract
//4. cannot instantiate abstract class i.e. cannot create object for abstract class
}

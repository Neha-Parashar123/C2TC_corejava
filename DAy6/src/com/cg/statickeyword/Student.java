package com.cg.statickeyword;

public class Student {
	private int id;
	private String name;
	 private  static String  College  =" MIET";
	 
	 //non-static method
	public static void modify() {
		
		 College = "Meerut Institute of engineering ";
		 
	 }
	 @Override
	public String toString() {
		return "Student [name=" + name + ", College=" + College + ", id=" + id + "]";
	}
	
	 public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}public static void main(String[] args) {
		Student s1 = new Student(1, "Neha");
		System.out.println(s1);
		System.out.println("After modification");
		
		modify();//1. way 
		System.out.println(s1);
		
	

}

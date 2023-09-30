package com.cg.packageone;

public class TestOne {
	private int id =5;
	private void display() {
	System.out.println("Access modifiers");
	}
	public static void main(String[] args) {
	TestOne t1	=new TestOne();
	System.out.println(t1.id);
	t1.display();

	}

}

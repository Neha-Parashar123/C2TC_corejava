package com.cg.overloading;

public class Methodoverloadingdemo {

	public static void main(String[] args) {
		point p = new point();
		point p1 = new point(10);
		point p2 = new point(10.0f , 20.0f, 30.0f);
		
		methodoverloading.addition(10, 20);
		methodoverloading.addition(10.0f, 20.0f);
	}

}

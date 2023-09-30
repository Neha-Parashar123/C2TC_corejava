package com.cg.abstractclass;
//concrete class
public class Triangle extends Shape {
	float side;
	float area;
	
	void calArea() {
		super.area =side * side;//area of parents class i.e. shape
		area = side;//area of child class i.e. triangle
		
	}
	
	
	

}

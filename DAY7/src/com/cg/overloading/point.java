package com.cg.overloading;

public class point {
	
	private float x;
	private float y;
	private float z;
	
	//constructor 1
	public point() {
		super();
	}
	//constructor 2
	public point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	//constructor 3
	public point(float x) {
		super();
		this.x = x;
	}
	//constructor 4
	public point(float y) {
		super();
		this.y = y;
	}
	//constructor 5
	public point(float x, float y, float z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}

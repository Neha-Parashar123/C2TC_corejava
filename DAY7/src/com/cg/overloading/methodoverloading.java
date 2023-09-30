package com.cg.overloading;

public class methodoverloading {
	//1.difference in datatype, same number of arguments;
	//2.same in datatype, different in number of arguments;
	//3.difference in datatypes and arguments;
	//4.difference in return type alone is not a concept of overloading;
	
	//method 1 -two arguments with int data type with int return type;
	public static int addition(int a , int b) {
		return a+b;
		
	}
	//method 2 -two arguments with float data type with int return type;
		public static float addition(float a , float b) {
			return a+b;
			
		}
		//method 3 -two arguments with double data type with int return type;
		public static double addition(double a , double b) {
			return a+b;
			
		}
		//method 4 -three arguments with int data type with int return type;
		public static int addition(int a , int b, int c) {
			return a+b;
			
		}
		//method 5
		public static double addition(float a , float b) {
			return a + b;
		}

}

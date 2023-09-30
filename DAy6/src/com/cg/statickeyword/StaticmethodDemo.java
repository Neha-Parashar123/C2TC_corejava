package com.cg.statickeyword;

public class StaticmethodDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Neha");
		System.out.println(s1);
		System.out.println("After modification");
		//2 ways -
		//1.directly with method name
		//2. invoking with the class name
		//3. u can also call with object refrence != not recommended e.g. s1.modify(
;		Student.modify();//2.approach
        System.out.println(s1);

	}

}

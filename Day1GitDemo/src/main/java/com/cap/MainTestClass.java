package com.cap;

public class MainTestClass {

	public static void main(String[] args) {
		SalesClass class1=new SalesClass();

		AddofTwo add=new AddofTwo();

		LargeofTwo large=new LargeofTwo();
		Multiplication mul=new Multiplication();

		// TODO Auto-generated method stub
System.out.println("Hello World");
class1.show();

add.sum(2,3);

large.findLarge(3,2);
mul.multiply(2,3);

greet();
	}
	public static void greet() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Capgemini");
		System.out.println("FLP Training 2018");
	}

}

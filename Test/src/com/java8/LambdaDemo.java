package com.java8;

interface A{
	public void show(int i);
}

//class B implements A{
//
//	@Override
//	public void show() {
//		System.out.println("Hello"); 
//		
//	}
//	
//}

public class LambdaDemo {

	public static void main(String[] args) {
		
//		A obj;
//		obj = new A() {
//			public void show(int i) {
//				System.out.println("Hii "+i); 
//			}
//		};
//		obj.show(6);
		
		A obj1;
//		obj1 = (int i) -> System.out.println("Hello "+ i);
//		obj1 = (i) -> System.out.println("Hello "+ i); 
		obj1 = i -> System.out.println("Hello "+ i);
		obj1.show(7);
	}

}

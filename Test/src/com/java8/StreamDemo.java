package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>(); 
		for(int i = 1; i<=5;i++) {
			values.add(i);
		}
//		for (Integer integer : values) {
//			System.out.println(integer); 
//		}
//		values.forEach(m->System.out.println(m));
//		values.forEach(System.out::println);
		
		Stream<Integer> stream = values.stream();
		stream.forEach(System.out::println);
//		stream.forEach(System.out::println);  Exception
		values.stream().forEach(System.out::println);
		values.parallelStream().forEach(System.out::println);
		
		System.out.println(values.stream().filter(i->{
			System.out.println("hi"); 
			return	true;
		}).findFirst());
		StreamDemo d = new StreamDemo();
		values.forEach(d::doubleit); 
	}
	
	public  void doubleit(int i) {
		System.out.println(i*2);
	}
	

}

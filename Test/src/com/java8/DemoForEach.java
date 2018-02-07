package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

//class ConsImpl implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer i) {
//		System.out.println(i); 
//		
//	}
//	
//}

public class DemoForEach {
	
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		
//		for (int integer : values) {
//			System.out.println(integer); 
//		}
		
//		for(int i = 0; i<values.size();i++) {
//			System.out.println(values.get(i)); 
//		}
//		
		// Internal Loop only in Java 8 onwards
		
//		values.forEach(i->System.out.println(i));  // Lambda // Implements Comsumer Interface :)  
//		Consumer<Integer> c = i->System.out.println(i);
//		values.forEach(c);
			Map<String, Integer> testMap = new HashMap<String,Integer>();
			
		
		values.forEach(i->System.out.println(i));
		
		values.forEach(i-> testMap.put(i.toString(), i)); 
		for (Map.Entry<String, Integer>  entry: testMap.entrySet()) {
			System.out.println(entry.getValue()); 
		}
	}

}

package com.tcs;

import java.util.Arrays;
import java.util.List;

public class Foreach_Example {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7);
		
		//External loop(outside the collection)
		for(int i=0; i< values.size(); i++)
		System.out.println("In for loop "+ values.get(i));
		
		for(int i: values)
			System.out.println("In enhanced for loop "+ i);
		
		values.forEach(i -> System.out.println("In forEach method "+i)); // with lambda expression
		
		values.forEach(System.out::println);
		values.stream().forEach(System.out::println);
		values.parallelStream().forEach(System.out::println);
		System.out.println("first one "+values.stream().filter(i->{return true;}).findFirst());

	}

}

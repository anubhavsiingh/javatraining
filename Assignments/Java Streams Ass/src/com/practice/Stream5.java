package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Stream5 {

	public static void main(String[] args) {
		
		//Aggregate functions
		List<Integer> IntegerArray= new ArrayList<Integer>();
		IntegerArray.add(2);
		IntegerArray.add(3);
		IntegerArray.add(14);
		IntegerArray.add(24);
		IntegerArray.add(11);
		IntegerArray.add(100);
		IntegerArray.add(142);
		
		
		
		Optional<Integer> max = IntegerArray.stream().max((a,b)->a>b?1:-1);
		Optional<Integer> min = IntegerArray.stream().max((a,b)->Integer.compare(b,a));
		System.out.println("Max is : "+max.get());
		System.out.println("Min is : "+min.get());
		
		Optional<Integer> sum = IntegerArray.stream().reduce((a,b)->a+b);
		System.out.println("Sum is : "+sum.get());
		
		long totalCount = IntegerArray.stream().count();
		System.out.println("Average is : "+(sum.get()/totalCount));
	}

}

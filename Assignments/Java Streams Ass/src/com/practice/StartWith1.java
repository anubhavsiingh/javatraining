package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StartWith1 {

	public static void main(String[] args) {
		//Numbers Starting with one
		List<Integer> IntegerArray= new ArrayList<Integer>();
		IntegerArray.add(1);
		IntegerArray.add(3);
		IntegerArray.add(14);
		IntegerArray.add(24);
		IntegerArray.add(11);
		IntegerArray.add(100);
		IntegerArray.add(142);
		
		
		Stream<Integer> ans = IntegerArray.stream().filter(x->(x.toString().charAt(0) == '1'));
		ans.forEach(System.out::println);
	}

}

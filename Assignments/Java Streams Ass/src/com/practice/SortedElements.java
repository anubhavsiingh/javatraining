package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedElements {

	public static void main(String[] args) {
		//Sort Elements
		List<Integer> IntegerArray= new ArrayList<Integer>();
		IntegerArray.add(1);
		IntegerArray.add(33);
		IntegerArray.add(144);
		IntegerArray.add(24);
		IntegerArray.add(11);
		IntegerArray.add(100);
		IntegerArray.add(142);
		
		
		Stream<Integer> ans = IntegerArray.stream().sorted();
		ans.forEach(System.out::println);
	}

}

package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
	
	
	//Even Numbers
	
	public static void main(String[] args) {
		List<Integer> IntegerArray= new ArrayList<Integer>();
		IntegerArray.add(1);
		IntegerArray.add(3);
		IntegerArray.add(14);
		IntegerArray.add(24);
		IntegerArray.add(11);
		IntegerArray.add(100);
		IntegerArray.add(142);
		
		Stream<Integer> ans = IntegerArray.stream().filter(x->x%2==0);
		ans.forEach(System.out::println);

	}

}

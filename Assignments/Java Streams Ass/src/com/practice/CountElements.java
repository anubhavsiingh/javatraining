package com.practice;

import java.util.ArrayList;
import java.util.List;

public class CountElements {

		//Count the number of elements
	public static void main(String[] args) {
		List<Integer> IntegerArray= new ArrayList<Integer>();
		IntegerArray.add(1);
		IntegerArray.add(3);
		IntegerArray.add(14);
		IntegerArray.add(24);
		IntegerArray.add(11);
		IntegerArray.add(100);
		IntegerArray.add(142);
		
		
		long ans = IntegerArray.stream().count();
		System.out.println(ans);
	}

}

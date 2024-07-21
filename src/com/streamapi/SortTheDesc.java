package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ch5andu16";
		int[] arr= {9,6,0,3,3,4,5,1,6,9};
		int[] descendingOrder = descendingOrder(arr);
		System.out.println(Arrays.toString(descendingOrder));
		System.out.println(sumOfGivenString(name));

	}
	private static int[] descendingOrder(int[] arr) {
		
		int[] array = Arrays.stream(arr)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .mapToInt(Integer::intValue)
        .toArray();

		return array;
		
	}
	
	private static int sumOfGivenString(String name) {
		
		int sum = name.chars()
		.filter(c -> c >= '0' && c <= '9')
        .map(c -> c - '0')
        .sum();
		
		return sum;

		
	}

}

package com.streamapi;

import java.util.Arrays;
import java.util.List;


public class SumOfElementsInArray {

	public static void main(String[] args) {
		int num[]= {8,1,4,3,8,8,7,3,6,7};
		List<String> strings = Arrays.asList("Hello"," ","World","!");
		System.out.println(sumOfNumbers(num));
		System.out.println(sumOfNumbersMethodRef(num));
		System.out.println(maxElement(num));
		System.out.println(concatStrings(strings));
		System.out.println(concatStringss(strings));

	}
	public static Integer sumOfNumbers(int num[]) {
		return Arrays.stream(num).reduce(10, (a,b)->(a+b));
	}
	public static Integer sumOfNumbersMethodRef(int num[]) {
		return Arrays.stream(num).reduce(0, Integer::sum);
	}
	public static Integer maxElement(int[] num){
		return Arrays.stream(num).boxed().reduce((a,b)->a>b?a:b).get();
	}
	public static String concatStrings(List<String> strings) {
		return strings.stream().reduce("", (a,b)->a+b);
	}
	public static String concatStringss(List<String> strings) {
		return strings.stream().reduce(String::concat).orElse("");
	}

}

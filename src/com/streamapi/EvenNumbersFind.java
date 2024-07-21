package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenNumbersFind {

	public static void main(String[] args) {
//		Set<Integer> asList=new HashSet<>();
//		asList.add(9);
//		asList.add(6);
//		asList.add(0);
//		asList.add(3);
//		asList.add(3);
//		asList.add(4);
//		asList.add(5);
//		asList.add(1);
//		asList.add(6);
//		asList.add(9);
//		asList.stream().forEach(i->System.out.println(i));
//		List<Integer> asList=new ArrayList<>();
//		asList.add(9);
//		asList.add(6);
//		asList.add(0);
//		asList.add(3);
//		asList.add(3);
//		asList.add(4);
//		asList.add(5);
//		asList.add(1);
//		asList.add(6);
//		asList.add(9);
//		asList.stream().filter(i->i%2==1).forEach(i->System.out.println(i));
		
		
		List<Integer> asList = Arrays.asList(9,6,3,3,4,5,1,6,9);
	long c=asList.stream().count();
	System.out.println(c);
//		.filter(i->i%2==0)
//		.forEach(i->System.out.println(i));
		

	}

}

package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("NTR","RC","BA","NTR","RC");
//		list.stream().distinct().forEach(i->System.out.println(i));
//		list.stream().distinct().limit(2).forEach(i->System.out.println(i));
		list.stream().distinct().limit(2).skip(1).forEach(i->System.out.println(i));
		
	}

}

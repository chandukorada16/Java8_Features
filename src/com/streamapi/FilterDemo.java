package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
//		List<String> names=Arrays.asList("chandu","ramu","somu","srinu","stateBankOfIndia","samosa");
//							names.stream()
//							.filter(i->i.startsWith("s"))
//							.map(i->i.length())
//							.forEach(i->System.out.println(i));
		 List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
//		 listOfStrings.stream().map(i->i.valueOf(i)).forEach(i->System.out.println(i));
		 List<Integer> list = listOfStrings.stream().map(Integer::valueOf).collect(Collectors.toList());
		 System.out.println(list);
	}

}

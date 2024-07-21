package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	
	public static void main(String[] args) {
		List<String> corejava=Arrays.asList("Oops","Exception","Multithreading","Collections");
		List<String> spring=Arrays.asList("Spring core","spring data Jpa","spring web mvc","Springboot","Restful");
		List<List<String>> backend=Arrays.asList(corejava,spring);
		backend.stream()
		.flatMap(i->i.stream())
		.forEach(i->System.out.println(i));
	}

}

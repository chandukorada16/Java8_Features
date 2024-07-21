package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamProgram {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Chandu","Ntr","Nayak","Devara","Chandu");
		names.stream().filter(i->i.length()==6).forEach(i->System.out.println(i));

	}

}

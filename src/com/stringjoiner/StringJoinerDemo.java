package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("-","(",")");
		sj.add("SpringCore");
		sj.add("SpringBoot");
		sj.add("Spring web MVC");
		sj.add("Spring Restful");
		sj.add("Microservices");
		System.out.println(sj);
		

	}

}

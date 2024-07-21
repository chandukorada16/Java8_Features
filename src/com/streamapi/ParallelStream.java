package com.streamapi;

import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5,14);
		stream1.forEach(f->System.out.println(f+" "+Thread.currentThread().getName()));
		
		System.out.println("--------------------------------");
		
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		stream2.parallel().forEach(f->System.out.println(f+" "+Thread.currentThread().getName()));

	}

}

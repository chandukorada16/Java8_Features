package com.streamapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstElementGivenList {
	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		Stream<Integer> stream2 = Stream.of(6,7,8,9,10);
		List<Integer> integers=Arrays.asList(9,56,0,3,3,4,51,1,6,9);
		List<String> strings = Arrays.asList("chandu","naveen","shankar");
		int[] arr= {8,1,4,3,8,8,7,3,6,7};
		System.out.println(firstElementInList(integers));
		System.out.println(sumOfElements(integers));
		System.out.println(sumOfElementsApproach(integers));
		System.out.println(totalNumberOfElements(integers));
		System.out.println(oddAndEvenNumbers(integers));
		System.out.println(startingWithFiveNumbers(integers));
		System.out.println(startingWithFiveNumbersApproach(integers));
		System.out.println(findDuplicateElements(integers));
		System.out.println(minimumElementInList(integers));
		System.out.println(maximumElementInList(integers));
		System.out.println(maximumElementInListAnotherApproach(integers));
		System.out.println(minimumElementInListAnotherApproach(integers));
		System.out.println(minimumElementInListAnotherApproachTwo(integers));
		System.out.println(maximumElementInListAnotherApproachTwo(integers));
		System.out.println(sortTheElements(integers));
		System.out.println(sortTheElementsInDescending(integers));
		System.out.println(sortTheElementsInDescendingApproach(integers));
		System.out.println(sortTheElementsInDescendingApproachTwo(integers));
		System.out.println(checkContainDuplicateElements(arr));
		System.out.println(checkContainDuplicateElements(arr));
		System.out.println(squareAndFilterGreaterThanFifty(integers));
		System.out.println(sortedArrayIntoStream(arr));
		System.out.println(covertIntoUpperCase(strings));
		System.out.println(maximumElementInGivenArray(arr));
		System.out.println(maximumElementInGivenArrayApproach(arr));
		System.out.println(concatTwoStreams(stream1,stream2));
		System.out.println(printTenNumbers());
		System.out.println(printCurrentDateAndTime());
		System.out.println(changeFormat());
		System.out.println(countOfEightNumeber(arr));
		System.out.println(countOfDuplicates(integers));
		
		
		
		
	}
	public static Integer firstElementInList(List<Integer> integers) {
		return integers.stream().findFirst().get();
	}
	public static long sumOfElements(List<Integer> integers) {
		return integers.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
	}
	public static Integer sumOfElementsApproach(List<Integer> integers) {
		return integers.stream().reduce((a,b)->(a+b)).get();
	}
	public static long totalNumberOfElements(List<Integer> integers) {
		return integers.stream().count();
	}
	public static Map<Boolean,List<Integer>> oddAndEvenNumbers(List<Integer> integers) {
		return integers.stream().collect(Collectors.partitioningBy(i->i%2==0));
	}
	public static List<String> startingWithFiveNumbers(List<Integer> integers){
		return integers.stream().map(i->i+"").filter(i->i.startsWith("5")).map(i->i.valueOf(i)).collect(Collectors.toList());
	}
	public static List<Integer> startingWithFiveNumbersApproach(List<Integer> integers){
		return integers.stream().filter(num->num.toString().startsWith("5")).collect(Collectors.toList());
	}
	public static List<Integer> findDuplicateElements(List<Integer> integers){
		Set<Integer> set=new HashSet<>();
		return integers.stream().filter(i->!set.add(i)).collect(Collectors.toList());
	}
	public static Integer minimumElementInList(List<Integer> integers) {
		return integers.stream().min(Comparator.comparing(Integer::intValue)).get();
	}
	public static Integer maximumElementInList(List<Integer> integers) {
		return integers.stream().max(Comparator.comparing(Integer::intValue)).get();
	}
	public static Integer maximumElementInListAnotherApproach(List<Integer> integers) {
		return integers.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).findFirst().get();
	}
	public static Integer minimumElementInListAnotherApproach(List<Integer> integers) {
		return integers.stream().sorted().findFirst().get();
	}
	public static Integer minimumElementInListAnotherApproachTwo(List<Integer> integers) {
		return integers.stream().min(Integer::compareTo).get();
	}
	public static Integer maximumElementInListAnotherApproachTwo(List<Integer> integers) {
		return integers.stream().max(Integer::compareTo).get();
	}
	public static List<Integer> sortTheElements(List<Integer> integers) {
		return integers.stream().sorted().collect(Collectors.toList());
	}
	public static List<Integer> sortTheElementsInDescending(List<Integer> integers) {
		return integers.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
	}
	public static List<Integer> sortTheElementsInDescendingApproach(List<Integer> integers) {
		return integers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	}
	public static List<Integer> sortTheElementsInDescendingApproachTwo(List<Integer> integers) {
		return integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
	public static String checkContainDuplicateElements(int[] arr) {
		if(Arrays.stream(arr).distinct().count()!=arr.length) {
			return "Array Contain Duplicates Values";
		}else {
			return "Array Does not Contain Duplicate Values";
		}
		
	}
	public static List<Integer> squareAndFilterGreaterThanFifty(List<Integer> integers){
		return integers.stream().map(num->num*num).filter(num->num>50).collect(Collectors.toList());
	}
	public static List<Integer> sortedArrayIntoStream(int[] arr){
		return Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
	}
	public static List<String> covertIntoUpperCase(List<String> strings){
		return strings.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
	}
	public static Integer maximumElementInGivenArray(int[] arr){
		return Arrays.stream(arr).boxed().max(Integer::compareTo).get();
	}
	public static Integer maximumElementInGivenArrayApproach(int[] arr){
		return Arrays.stream(arr).max().getAsInt();
	}
	public static List<Integer> concatTwoStreams(Stream<Integer> stream1,Stream<Integer> stream2) {
		return Stream.concat(stream1, stream2).collect(Collectors.toList());
	}
	public static List<Integer> printTenNumbers(){
		Random random=new Random();
		return Stream.generate(random::nextInt).limit(10).collect(Collectors.toList());
	}
	public static LocalDateTime printCurrentDateAndTime() {
		return LocalDateTime.now();
	}
	public static String changeFormat() {
		LocalDateTime local=LocalDateTime.now();
		return DateTimeFormatter.ofPattern("dd-mm-yyyy").format(local);
	}
	
	public static Long countOfEightNumeber(int[] arr) {
		int number=8;
		return Arrays.stream(arr).filter(i->i==number).count();
	}
	public static Map<Integer,Long> countOfDuplicates(List<Integer> integers){
		return integers.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	}
	
	
	

}

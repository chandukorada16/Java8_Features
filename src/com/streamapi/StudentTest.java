package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student(3, "Ramu", 45000.00);
		Student s2=new Student(1, "Somu", 40000.00);
		Student s3=new Student(2, "Damu", 30000.00);
		
		List<Student> s=Arrays.asList(s1,s2,s3);
		Optional<Student> maxsalary = s.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getSalary)));
		System.out.println(maxsalary);
		
		Optional<Student> minsalary=s.stream().collect(Collectors.minBy(Comparator.comparing(Student::getSalary)));
		System.out.println(minsalary);
		
		Double avgSalary = s.stream().collect(Collectors.averagingDouble(Student::getSalary));
		System.out.println(avgSalary);
		
		System.out.println("-------------------------------------------------");
		
		Map<String, List<Student>> collect = s.stream().collect(Collectors.groupingBy(Student::getsName));
		System.out.println(collect);
		
		s.stream().collect(Collectors.toList()).forEach(f->System.out.println(f));
		
		s.stream().sorted(Comparator.comparing(Student::getsId).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println(s.stream().collect(Collectors.summarizingDouble(Student::getSalary)));
		//System.out.println(statistics.);
		
		Double collect2 = s.stream().collect(Collectors.summingDouble(Student::getSalary));
		System.out.println(collect2);
		
		s.stream().filter(i->i.getSalary()>=40000.00).forEach(i->System.out.println(i));
		//Optional Class is avoid null pointer Exceptions
		
		
	}

}

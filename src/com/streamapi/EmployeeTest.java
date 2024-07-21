package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Chandu",24,24500.00);
		Employee e2=new Employee(3,"Ramu",44,284500.00);
		Employee e3=new Employee(2,"Suresh",34,54500.00);
		Employee e4=new Employee(4,"Harsha",14,84500.00);
		List<Employee> list = Arrays.asList(e1,e2,e3,e4);
		
		double sum = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
		System.out.println(sum);
		
		
		
	}
	

}

package com.java_hacks.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeData {

	public static void main(String[] args) {
		List<Employee> empData=new ArrayList<>();
		empData.add(new Employee(1,"Chandu","Developer",50000.00,30,2018,"Male"));
		empData.add(new Employee(2,"Jane","Manager",60000.00,35,2015,"Female"));
		empData.add(new Employee(3,"Sameer","Sr Developer",75000.00,33,2016,"Male"));
		empData.add(new Employee(4,"harsha","Lead Developer",55000.00,35,2018,"Male"));
		empData.add(new Employee(5,"ntr","Lead Developer",65000.00,38,2017,"Male"));
		empData.add(new Employee(6,"shankar","Developer",85000.00,37,2019,"Female"));
		
		//1.Calculate Avg Salary
		Double avgSalary = empData.stream().collect(Collectors.averagingDouble(Employee::getEmpSalary));
		System.out.println("The Average Salary is "+avgSalary);
		
		//2.Find the Employee who are joined in the specific year
		List<Employee> joinedIn2018 = empData.stream().filter(emp->emp.getEmpYearOfJoining()==2018).collect(Collectors.toList());
		System.out.println("Emps Joined in 2018 "+joinedIn2018);
		
		//3.Find the Highest Salary Employee in our Organization
//		Employee highestSalary = empData.stream().max(Comparator.comparing(Employee::getEmpSalary)).get();
		Employee highestSalary = empData.stream().max(Comparator.comparingDouble(Employee::getEmpSalary)).get();
		System.out.println("Highest Salary in Organization is "+highestSalary);
		
		//4.Find the Second Highest Salary in the Organization 
		try {
		Employee secondHigh = empData.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
		.skip(1).findFirst().orElseThrow(()->new Exception("Second highest salary not found"));
		System.out.println("Second Highest Salary is "+secondHigh);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//5.How many Employee are there in each department Stream api
		Map<String, Long> DepWiseCount = empData.stream().collect(Collectors.groupingBy(Employee::getEmpRole,Collectors.counting()));
		//System.out.println(DepWiseCount);
		DepWiseCount.forEach((key,value)->{
			System.out.println(key+"="+value);
		});
		
		//6.How many male and female Employees in that organization
		Map<String, Long> genderCount = empData.stream().collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting()));
		genderCount.forEach((key,value)->{
			System.out.println(key+"="+value);
			
			//this method 
		});
		
		//7.Increment Employees Salary in Developer role 10%.
		empData.stream().filter(emp->emp.getEmpRole().equals("Developer")).forEach(emp->emp.setEmpSalary(emp.getEmpSalary()*1.10));
		empData.forEach(emp->System.out.println(emp));
	}

}





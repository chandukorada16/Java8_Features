package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class EmployeeTestMap {

	public static void main(String[] args) {
		EmployeeMap e1=new EmployeeMap(101,"Chandu",80000.00);
		EmployeeMap e2=new EmployeeMap(102,"Bindu",40000.00);
		EmployeeMap e3=new EmployeeMap(103,"Indu",60000.00);
		
		List<EmployeeMap> emp=Arrays.asList(e1,e2,e3);
		emp.stream()
		.filter(i->i.salary>50000.00)
		.map(i->i.id+" "+i.name)
		.forEach(i->System.out.println(i));
	
		
	}

}

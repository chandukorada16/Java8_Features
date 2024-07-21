package com.streamapi;

public class EmployeeMap {
	Integer id;
	String name;
	Double salary;
	
	public EmployeeMap(Integer id,String name,Double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "EmployeeMap [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}

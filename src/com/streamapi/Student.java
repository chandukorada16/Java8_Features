package com.streamapi;

public class Student {
	
	private Integer sId;
	
	private String sName;
	
	private Double salary;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Student(Integer sId, String sName, Double salary) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", salary=" + salary + "]";
	}
	
	
	
	

}

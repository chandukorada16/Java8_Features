package com.java_hacks.streams;

public class Employee {
	
	private Integer empId;
	
	private String empName;
	
	private String empRole;
	
	private Double empSalary;
	
	private Integer empAge;
	
	private Integer empYearOfJoining;
	
	private String empGender;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public Integer getEmpYearOfJoining() {
		return empYearOfJoining;
	}

	public void setEmpYearOfJoining(Integer empYearOfJoining) {
		this.empYearOfJoining = empYearOfJoining;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public Employee(Integer empId, String empName,String empRole, Double empSalary, Integer empAge, Integer empYearOfJoining,
			String empGender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole=empRole;
		this.empSalary = empSalary;
		this.empAge = empAge;
		this.empYearOfJoining = empYearOfJoining;
		this.empGender = empGender;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empSalary=" + empSalary
				+ ", empAge=" + empAge + ", empYearOfJoining=" + empYearOfJoining + ", empGender=" + empGender + "]";
	}

	

	
	
	
	

}

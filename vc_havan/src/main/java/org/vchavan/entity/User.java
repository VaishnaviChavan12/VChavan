package org.vchavan.entity;

public class User {
	private int empID;
	private String empName;
	private String Designation;
	private int Salary;
	public User(int empID, String empName, String Designation, int Salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.Designation = Designation;
		this.Salary = Salary;
	}
	
	public User(String empName, String Designation, int Salary) {
		super();
		this.empName = empName;
		this.Designation = Designation;
		this.Salary = Salary;
	}
	
	public int getempID() {
		return empID;
	}
	public void setempID(int empID) {
		this.empID = empID;
	}
	public String getempName() {
		return empName;
	}
	public void setempName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary = Salary;
	}
	

	
}

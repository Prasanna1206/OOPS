package org.test.login;

public class Encap1 {
	private String empName;
	private int empId;
	public int salary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void calculateBonus(int salary) {

		System.out.println(salary * 10 / 100);

	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

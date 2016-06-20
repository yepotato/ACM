package haut.struct;

import java.util.Date;

public class Employee {
	private String name ;
	private double salary ;
	private Date hirday ;
	
	public Employee(String name,double salary ,int year,int month,int day){
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getHirday() {
		return hirday;
	}

	public void setHirday(Date hirday) {
		this.hirday = hirday;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hirday="
				+ hirday + "]";
	}
	
	

}

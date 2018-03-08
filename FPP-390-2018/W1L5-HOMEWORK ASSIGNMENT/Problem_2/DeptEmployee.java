package Problem_2;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private double salary;
	private LocalDate hireDate;
public DeptEmployee(String name, double salary, LocalDate hireDate) {
	this.name = name;
	this.salary = salary;
	this.hireDate = hireDate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public LocalDate getHireDate() {
	return hireDate;
}
public void setHireDate(LocalDate hireDate) {
	this.hireDate = hireDate;
}
//computeSalary default implementation
public double computeSalary(){
	return salary;
}
}

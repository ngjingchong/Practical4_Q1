/**
 * @Employee.java
 *
 * Practical_4 application
 *
 * @author 
 * @version 1.00 2020/7/9
 */
 
public class Employee {
	private String name;
	private double salary;
	
	public Employee() {
		name = " ";
		salary = 0.0;
	}
	
	public Employee(String employeeName) {
		name = employeeName;
		salary = 0.0;
	}
	
	public Employee(String employeeName, double currentSalary) {
		name = employeeName;
		salary = currentSalary;
	}
	
	public void raiseSalary(double percent){
		salary = salary + (salary * percent / 100.0);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String new_name) {
		name = new_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double new_salary) {
		salary = new_salary;
	}

}

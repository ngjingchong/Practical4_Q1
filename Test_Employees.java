/**
 * @(#)Test_Employees.java
 *
 *
 * @author 
 * @version 1.00 2020/7/9
 */

public class Test_Employees {

    public static void main (String [] args) {
    	Employee emp1 = new Employee("J.chong", 10000.00);
    	Employee emp2 = new Employee("Xiao hong");
    	emp2.setSalary(4600.00);
    	
    	System.out.println("Before raise Salary (" + emp1.getName() + "): " + emp1.getSalary());
    	emp1.raiseSalary(8.0);
   		System.out.println("Raised Salary (" + emp1.getName() + "): " + emp1.getSalary());
    	
    	System.out.print("Employees with highest salary: ");
    	if(emp1.getSalary()>emp2.getSalary()){
            System.out.println(emp1.getName());
        }
        else{
            System.out.println(emp2.getName());
        }
        
        System.out.println("Total Salary: " + (emp1.getSalary()+emp2.getSalary()));
    }
}

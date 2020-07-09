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
    	
    	System.out.println("Salary (old): " + emp1.getSalary());
    	emp1.raiseSalary(8.0);
   		System.out.println("Salary (new): " + emp1.getSalary());
    	
    	if(emp1.getSalary()>emp2.getSalary()){
            System.out.println("name: " + emp1.getName()+ " salary: " + emp1.getSalary());
        }
        else{
            System.out.println("name: " + emp2.getName()+ "salary: " + emp2.getSalary());
        }
        
        System.out.println("Total Salary: " + (emp1.getSalary()+emp2.getSalary()));
        
    }
    
    
}
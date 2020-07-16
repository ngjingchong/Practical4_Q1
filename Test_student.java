/**
 * @(#)Test_Student.java
 *
 *
 * @author 
 * @version 1.00 2020/7/12
 */


public class Test_Student {

    public static void main (String [] args) {
    	Student stud1 = new Student("1902099WMD", "jchong");
    	Student stud2 = new Student();
    	
    	stud1.setQuizCount(10);
    	stud1.setTotalScore(18);
    	
    	stud2.setID("1234abc");
    	stud2.setName("test student");
    	stud2.setQuizCount(10);
    	stud2.setTotalScore(15);
    	
    	stud1.addQuiz(2);
    	System.out.println("Student ID : " + stud1.getID());
    	System.out.println("Student Name : " + stud1.getName());
    	System.out.println("Total Quiz Takken : " + stud1.getQuizCount());
    	System.out.println("Total Scores Gets : " + stud1.getTotalScore());
    	System.out.println("Average Scores : " + stud1.getAverageScore());
    	
    	System.out.println("Student ID : " + stud2.getID());
    	System.out.println("Student Name : " + stud2.getName());
    	System.out.println("Total Quiz Takken : " + stud2.getQuizCount());
    	System.out.println("Total Scores Gets : " + stud2.getTotalScore());
    	System.out.println("Average Scores per Quiz : " + stud2.getAverageScore());
    }
    
    
}

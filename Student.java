/**
 * @(#)P4Q2.java
 *
 *
 * @author 
 * @version 1.00 2020/7/12
 */


public class Student {
	private String id;
	private String name;
	private int quizCount;
	private static double totalScore;
		
    public Student() {
    String id=" ";
	String name=" ";
	int quizCount=0;
	double totalScore=0.0;
    }
    
    public Student(String studID, String new_name) {
    id=studID;
	name=new_name;
	quizCount=0;
	totalScore=0.0;
    }
    
    public String getID (){
    	return id;
    }
    public String getName (){
    	return name;
    }
    public int getQuizCount (){
    	return quizCount;
    }
    //score per question is not stated
    public double getTotalScore (){
    	return totalScore;
    }
    
    public void setID (String studID) {
    	id = studID;
    }
    public void setName (String studName) {
    	name = studName;
    }
    public void setQuizCount (int new_quizCount) {
    	quizCount = new_quizCount;
    }
    //public void setTotalScore (double new_quizScore) {
    	//totalScore = new_quizScore;
    //}
    
    public void addQuiz (int score) {
    	quizCount++;
    	totalScore += score;
    }
    
    public double getAverageScore() {
    	return totalScore/quizCount;
    }
}
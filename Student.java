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
	private int totalScore;
		
    public Student() {
    	//leave it empty since question has no specify any defualt value
    //String id=" ";
	//String name=" ";
	//quizCount=0;
	//totalScore=0;
    }
    
    public Student(String studID, String new_name) {
    id=studID;
	name=new_name;
	quizCount=0;
	totalScore=0;
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
    public int getTotalScore (){
    	return totalScore;
    }
    
    public void setID (String studID) {
    	id = studID;
    }
    public void setName (String studName) {
    	name = studName;
    }
    
    public void addQuiz (int score) {
    	quizCount++;
    	totalScore += score;
    }
    
    public double getAverageScore() {
    	return totalScore/(double)quizCount;
    }
}

package Chapter04;

//****************************************************************
//Student.java
//
//Define a student class that stores name, score on test 1, and
//score on test 2.  Methods prompt for and read in grades, 
//compute the average, and return a string containing student’s info. 
//****************************************************************
import java.util.Scanner;

public class Student
{
	private String name;
	private double score1;
	private double score2;
	Scanner scan = new Scanner(System.in);
	//-----------------------------------------------
	//constructor
	//-----------------------------------------------
	public Student(String studentName)
	{
		name = studentName;
	}
	
	//-----------------------------------------------
	//inputGrades: prompt for and read in student's grades for test1 and test2.
	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	//-----------------------------------------------
	public void inputGrades()
	{
		System.out.print("Enter " + name + "'s score for test1: ");
		score1 = scan.nextDouble();
		System.out.print("Enter " + name + "'s score for test2: ");
		score2 = scan.nextDouble();
	}
	
	//-----------------------------------------------
	//getAverage: compute and return the student's test average
	//-----------------------------------------------
	
	public double getAverage(int s1, s2);
	{
		return s1 + s2
	}
	
	//-----------------------------------------------
	//getName: print the student's name
	//-----------------------------------------------
	
	//add header for printName
	{
	//add body of printName
	}

}

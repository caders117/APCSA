/****************************************************************
 *   Student class that takes two test scores and can compute the
 *   average.  Includes a toString method.
 *   @author Cade
 *   @version 10/22/2017
 * 
 */
import java.util.Scanner;

public class Student
{
    private String name;
    private int score1;
    private int score2;
    private Scanner scan = new Scanner(System.in);

    /**
     * Constructor method for Student class
     * @param studentName - Name of student
     */
    public Student(String studentName)
    {
		name = studentName;
    }
    
    /**
     * Method to return a string representation of the object
     */
    public String toString(){
    	return "Name: " + name + "  Test1: " + score1 + "  Test2: " + score2;
    }

    /**
     * Prompts for and read in student's grades for test1 and test2.
     * 
     */
    public void inputGrades()
    {
		System.out.print("Enter " + name + "'s score for test1: ");
		score1 = scan.nextInt();
		System.out.print("Enter " + name + "'s score for test2: ");
		score2 = scan.nextInt();
    }

    /**
     * Computes and returns the student's test average
     */
    public double getAverage()
    {
		return (score1 + score2) / 2.0;
    }

    /**
     * Getter method for the student's name
     * @return The name of the student
     */
    public String getName(){
    	return name;
    }
    
    public void printName()
    {
	//add body of printName
    }

}

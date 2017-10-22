/****************************************************************
 *This is the driver program that computes the grades and averages
 * of two Student objects.
 * @author Cade
 * @version 10/22/17
 */

public class Grades
{
    public static void main(String[] args)
    {
	Student student1 = new Student("Mary");
	//create student2, "Mike"
	Student student2 = new Student("Mike");
	//input grades for Mary
	student1.inputGrades();
	//print average for Mary
	System.out.println("The average for " + student1.getName() + " is " + student1.getAverage());

	System.out.println();

	//input grades for Mike
	student2.inputGrades();
	//print average for Mike
	System.out.println("The average for " + student2.getName() + " is " + student2.getAverage());
    
    System.out.println("Student 1:  " + student1);
    System.out.println("Student 1:  " + student1);

    }
}

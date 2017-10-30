package ch06;

/***************************************************************
 * This programeReads in and stores sales for each of 5 salespeople. Displays
 * sales entered by salesperson id and total sales for all salespeople.
 * 
 * @author Cade
 * @version 10/30/17
 * 
****************************************************************/
import java.util.Scanner;
public class Sales
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int salesPeople = 5;
		int sum;
		int max = 0;
		int min = 0;
		
		System.out.print("How many salespeople? ");
		salesPeople = scan.nextInt();
		int[] sales = new int[salesPeople];
		
		for (int i=0; i < sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + i + ": ");
			sales[i] = scan.nextInt();
		}
		
		System.out.println("\nSalesperson Sales");
		System.out.println("--------------------");
		sum = 0;
		
		for (int i=0; i < sales.length; i++)
		{
			System.out.println("\t " + i + "\t\t\t" + sales[i]);
			sum += sales[i];
			if(sales[i] > sales[max]){
				max = i;
			}
			if(sales[i] < sales[min]){
				min = i;
			}
		}
		
		System.out.println("\nTotal sales: " + sum);
		System.out.println("Average: " + (sum/5.0));
		System.out.println("Salesperson " + max + " had the highest sale with $" + sales[max]);
		System.out.println("Salesperson " + min + " had the highest sale with $" + sales[min]);

		
	}
}




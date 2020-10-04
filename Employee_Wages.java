package pac3;

import java.util.Random;
import java.util.Scanner;

public class Employee_Wages {
	public static void main(String[] args) 
	{
		int wageHour = 20;
		int fullHours = 8;
		int partHours = 4;
		
		
		System.out.println("\n\n\t\t\tWelcome to Employee Wage Computation Program");
		
		Random random = new Random();
		
		int randValue = random.nextInt(10);
		
		
			if(randValue <= 6)
			{
				System.out.println("\n\tFull time Employee is present");
				System.out.println("\n\tWage : "+(wageHour*fullHours));
			}
			else
				System.out.println("\n\tEmployee is absent");
		
		
			if(randValue <= 6)
			{
				System.out.println("\n\tPart time Employee is present");
				System.out.println("\n\tWage : "+(wageHour*partHours));
			}
			else
				System.out.println("\n\tEmployee is absent");
	}

}

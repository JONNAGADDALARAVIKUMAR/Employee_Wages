package pac3;

import java.util.Random;
import java.util.Scanner;

public class Employee_Wages {
	public static void main(String[] args) 
	{
		int wageHour = 20;
		int fullHours = 8;
		int partHours = 4;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\n\t\t\tWelcome to Employee Wage Computation Program\n\n\tChoose type of Employee\n\n\t\t1.Full Time Employee\n\t\t2.Part Time Employee\n\tOPTION : ");
		
		Random random = new Random();
		
		int randValue = random.nextInt(10);
		
		int empType = scan.nextInt();
		
		switch (empType)
		{
		
		case 1:
			if(randValue <= 6)
			{
				System.out.println("\n\tFull time Employee is present");
				System.out.println("\n\tWage : "+(wageHour*fullHours));
			}
			else
				System.out.println("\n\tEmployee is absent");
			break;
		case 2:
			
			if(randValue <= 6)
			{
				System.out.println("\n\tPart time Employee is present");
				System.out.println("\n\tWage : "+(wageHour*partHours));
			}
			else
				System.out.println("\n\tEmployee is absent");
			break;
		}
	}

}

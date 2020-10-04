package pac3;

import java.util.Random;

public class Employee_Wages {
	public static void main(String[] args) 
	{
		int wageHour = 20;
		int dayHours = 8;
		
		System.out.println("\n\n\t\t\tWelcome to Employee Wage Computation Program");
		
		Random random = new Random();
		
		int randValue = random.nextInt(10);
		
		if(randValue <= 6)
		{
			System.out.println("Employee is present");
			System.out.println("Wage : "+(wageHour*dayHours));
		}	
		else
			System.out.println("Employee is absent");
	}

}

package pac3;

import java.util.Random;
import java.util.Scanner;

public class Employee_Wages {
	public static void main(String[] args) 
	{
		int wageHour = 20;
		int fullHours = 8;
		int partHours = 4,present=0,absent=0,wage=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\n\t\t\tWelcome to Employee Wage Computation Program\n\n\tChoose type of Employee\n\n\t\t1.Full Time Employee\n\t\t2.Part Time Employee\n\tOPTION : ");
		
		Random random = new Random();
		
		
		
		int empType = scan.nextInt();
		
		for(int i=0;i<20;i++)
		{
			int randValue = random.nextInt(10);
			switch (empType)
			{
		
			case 1:
				if(randValue <= 6)
				{
					present++;
					wage+=(wageHour*fullHours);
				}
				else
					absent++;;
				break;
			case 2:
			
				if(randValue <= 6)
				{
					present++;
					wage+=(wageHour*partHours);
				}
				else
					absent++;;
				break;
			}
		}
		System.out.println("\nPresent : "+present+"\nAbsent : "+absent+"\ntotal Wage for a month : "+wage);
	}

}

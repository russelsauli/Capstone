package main;

/**
* Java Course 4 Capstone
*
* @author John Russel Sauli
* @Description:  A simple Automobile Insurance Policy and 
* 				Claims Administration system (PAS) will be created
* 			    to manage customer automobile insurance policies 
* 				and as well as accident claims for an insurance company. 
* Created Date: 6/26/2022
* Modified Date:9/23/2022
* @Modified By: John Russel Sauli
*
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputValidator {

	Scanner input = new Scanner(System.in);
	
	Print print= new Print(); // instiantiate print class contains the printing of 
	
	public String returnDateFormat(String label) {

		String dateFormat = "";
		
		int year = 0, month = 0, day = 0;
		
		do {
			
			System.out.print(label.toUpperCase() + "(MM-DD-YYYY): ");

			try {

				dateFormat = input.nextLine();

				month = Integer.parseInt(dateFormat.substring(0, dateFormat.indexOf("-")));	// Concatenate the string and convert the parse value to int
				
				
				day = Integer.parseInt(dateFormat.substring(dateFormat.indexOf("-") + 1, dateFormat.lastIndexOf("-"))); // Concatenate the string and convert the parse value to int
				
				year = Integer.parseInt(dateFormat.substring(dateFormat.lastIndexOf("-") + 1));	// Concatenate the string and convert the parse value to int

				dateFormat = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.of(year, month,day));	// formatting or setting a date and giving its value to string

			} catch (Exception e) {
				
				print.headerLabel("INCORRECT DATE FORMAT");
				
				dateFormat="";
			}
			
		} while (dateFormat.equals(""));
		
		return dateFormat;
	}
	
	// a method that return value of fouble
	public int returnInterger(String label) {

		int returnInteger = 0;

		do {
			
			try {

				System.out.print(label.toUpperCase());
				
				returnInteger = input.nextInt();
				
				if(returnInteger<=0) {
				
					System.out.println("VALUE SHOULD NOT BE LESS THAN OR EQUAL TO 0");
				}
				
			} catch (Exception e) {
				
				input.next();
				
				System.out.println("INCORRECT INPUT");
			}
		} while (returnInteger <0);

		return returnInteger;
	}
	
	// a method that validate and return value if the input is a valid Double value 
	public double returnDouble(String label) {
		
		double returnDouble = 0;

		do {
			try {

				System.out.print(label.toUpperCase());
				
				returnDouble = input.nextDouble();

				returnDouble=Math.round(returnDouble * 100.00) / 100.00;
				
				if (returnDouble<=0) {	// if input is less than 0 or 0
					
					System.out.println("VALUE SHOULD NOT BE LESS THAN OR EQUAL TO 0");
					
					returnDouble=Math.round(returnDouble * 100.00) / 100.00;
				}
				
			} catch (Exception e) {
				input.next();
				System.out.println("INVALID INPUT");
				System.out.println("");
				returnDouble=0;	// set value to -1 to be able to loop again if when input is invalid aftyer catch
			}
		} while (returnDouble<=0);

		return returnDouble;
	}
	
	
	// a method that check if the input is null or black
	public String returnString(String label) {
		
		String returnString;
		
		do {
			System.out.print(label.toUpperCase());
			
			returnString = input.nextLine();

			if(returnString.isBlank()) {	// if input is null 
				
				System.out.println("*INPUT CANT BE NULL*");
			}
		}while (returnString.isBlank());

		return returnString;
	}

	// a method that check if the input is Y or N and return the value of it
	public String returnChoice(String label) {

		String returnString = "";

		boolean isChoice = false;

		do {
			System.out.print(label.toUpperCase());
			
			returnString = input.nextLine();

			if (returnString.equalsIgnoreCase("Y")|| returnString.equalsIgnoreCase("N")) {	// if input is y or n will return is choice to true 

				isChoice = true;
			} 
			else {
				print.headerLabel("INVALID INPUT");
			}
			
		} while (isChoice == false);

		return returnString;
	}
}

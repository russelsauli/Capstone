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

public class Capstone {

	public static void main(String[] args) {
		

		CapstoneProcess capstone = new CapstoneProcess();	// instiantiate capstone process witch contain the process of the capstone
		
		InputValidator inputValidator= new InputValidator();	// instiantiate the input validator that contains the validation of input
		
		String choice;	// the selected process of capstone
		
		do {
			// display choices 
			System.out.println("\n1: CREATE A NEW CUSTOMER ACCOUNT");
			System.out.println("2: GET A POLICY QUOTE AND BUY THE POLICY.");
			System.out.println("3: CANCEL A SPECIFIC POLICY  ");
			System.out.println("4: FILE AN ACCIDENT CLAIM AGAINST A POLICY.");
			System.out.println("5: SEARCH FOR A CUSTOMER ACCOUNT ");
			System.out.println("6: SEARCH FOR AND DISPLAY A SPECIFIC POLICY");
			System.out.println("7: SEARCH FOR AND DISPLAY A SPECIFIC CLAIM");
			System.out.println("8: EXIT THE PAS SYSTEM");
			System.out.println("\n___________________________________________________________________________________________\n");
			
			choice=inputValidator.returnString("Select: ");	// get the selected choice
			
			if(choice.equals("1")) {
				
				capstone.createCustomerAccount();	// call the creation of customer
			}
			else if(choice.equals("2")) {
				
				capstone.getAndBuyPolicyQuote(); //  create a policy
			}
			
			else if(choice.equals("3")) {
				capstone.cancelPolicy();	// cancel a policy
			}
			else if(choice.equals("4")) {
				capstone.fileAccidentClaims();	// find and claim policy
			}
			else if(choice.equals("5")) {
				capstone.searchCustomer();		// search customer account
			}
			else if(choice.equals("6")) {
				capstone.searchPolicy();	// search a policy
			}
			else if(choice.equals("7")) {
				capstone.searchClaims();	// search claim
			}
			else if(choice.equals("8")) {
				
				System.out.print("PROGRAM CLOSE");	// stop program
				break;
			}
			else {
				System.out.println("INPUT IS NOT ON SELECTION ");	// incorrect input
			}
			
		}while(!choice.equals("8"));	// loop until the choice is equal to 8
		
	}

}

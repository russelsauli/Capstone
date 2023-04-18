package main;



import java.util.ArrayList;

import models.Claims;
import models.CustomerAccount;
import models.Policy;
import models.PolicyHolder;
import models.Vehicle;


public class Print {

	// a method that print label or text
	public void headerLabel(String label) {
		
		System.out.println("___________________________________________________________________________________________");
		System.out.println(label.toUpperCase());
		System.out.println("---------------------------------------------------------------------------------------------");
	}
	// a method that print the value of the customer class that been passed by parameter
	public void printCustomerAccount(CustomerAccount tempCustomerAccountr) {
		
		headerLabel("CUSTOMER DETAILS");
		System.out.println("\nACCOUNT NUMBER        : " + tempCustomerAccountr.getAccountNumber());
		System.out.println("FIRST NAME            : " + tempCustomerAccountr.getFirstName().toUpperCase());
		System.out.println("LAST NAME             : " + tempCustomerAccountr.getLastName().toUpperCase());
		System.out.println("ADDRESS               : " + tempCustomerAccountr.getAddress().toUpperCase());
	

	}
	
	// a method that print the value of the policy holder class that been passed by parameter
		public void printPolicyHolder(PolicyHolder tempPolicyHolder,String label) {
			
			headerLabel("POLICY HOLDER DETAILS");
			System.out.println("FIRST NAME            : " + tempPolicyHolder.getFirstNamePH().toUpperCase());
			System.out.println("LAST NAME             : " + tempPolicyHolder.getLastNamePH().toUpperCase());
			System.out.println("ADDRESS               : " + tempPolicyHolder.getAddressPH().toUpperCase());
			System.out.println("BIRTHDATE             : " + tempPolicyHolder.getBirthDate().toUpperCase());
			System.out.println("LICENSE NUMBER	      : " + tempPolicyHolder.getDriversLicence().toUpperCase());
			System.out.println("LICENSE NUMBER ISSUED : " + tempPolicyHolder.getDriversLicenseIssued().toUpperCase());
		}
		// a method taht print policy details
		public void printPolicy(Policy tempPolicy) {
			
			boolean isExpired;
			
			int claimCount=0;
			Claims claims = new Claims();
			ArrayList<Object> claimsList= new ArrayList<Object>();
			
			claimsList=claims.loadData();
			
			claimCount=claimsList.stream().filter(a->((Policy) a).getPolicyNumber().equalsIgnoreCase(tempPolicy.getPolicyNumber())).toList().size();
			
			isExpired=(tempPolicy.getIsExpired()==1)? true: false;
			
			headerLabel("POLICY DETAILS");
			System.out.println("POLICY#	        : " + tempPolicy.getPolicyNumber());
			System.out.println("POLICY PREMIUM  : $" +tempPolicy.getPremiumCharge());
			System.out.println("EFFECTIVE DATE  : " + tempPolicy.getEffectiveDate());
			System.out.println("EXPIRATION DATE : " + tempPolicy.getExpirationDate());
			System.out.println("CLAIM           : "+claimCount );
			System.out.println("CANCELED        : "+isExpired);
		}
		// a method that print the value of araylist vehicle that been passed by parameter
		public void printVehicle(Vehicle tmpvehicle) {
			
			String format = "%-20s %-20S %-20s %-20S %-10s  \n";

			System.out.format(format, tmpvehicle.getMake(), tmpvehicle.getModel(), tmpvehicle.getYear(),
						tmpvehicle.getPurchasePrice(), tmpvehicle.getPremiumCharged());
			
			System.out.println("*******************************************************************************************");
		}
		
		// preint policy detail data
		public void printClaims(Claims claims) {
			
			headerLabel("CLAIM DETAILS");
			
			System.out.println("CLAIM#	               :" + claims.getClaimNumber());
			System.out.println("ACCIDENT DATE          :" + claims.getAccidentDate());
			System.out.println("ACCIDENT LOCATION      :" + claims.getAccidentLocation());
			System.out.println("DESCRIPTION OF ACCIDENT:" + claims.getAccidentDescription());
			System.out.println("DESCRIPTION OF DAMAGE  :" + claims.getDescriptionOfDamage());
			System.out.println("ESTIMATE COST          :$" + claims.getEstimateCost());

		}
	
}
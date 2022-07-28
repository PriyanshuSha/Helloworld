// This is a java Program for a bank process

import java.util.Scanner;

class bankProcess // main class               						
{
   public static void main(String args[])
  {
	int amount=400,accountNumber=23240002,accountBalance=4000;
	String customerName="Raj";             
	Scanner ps = new Scanner(System.in); // Scanner object
	customerDetails customer1 = new customerDetails();				
	customer1.createAccount(accountNumber,customerName,accountBalance);		
	
	customer1.depositAmount(amount); // customer deposited amount
	customer1.getAmount(); 
	customer1.withdrawAmount(amount);// customer withdraw amount
	customer1.getAmount();
	customerDetails customer2 = new customerDetails();
	
  }
}			

  class customerDetails     // subclass 
{
	private int accNumber;             
	private String accHolderName;
	private int accBalance;
  public void createAccount(int accountNumber, String customerName, int accountBalance)// first method 
 {
	accNumber = accountNumber;            
	accHolderName = customerName;        
	accBalance = accountBalance;
 }
   public void depositAmount(int amount)// second method		
  {	
	System.out.println("Your depositing amount is ="+amount);		
	accBalance += amount;
  }
    public void withdrawAmount(int Amount)// third method		
   {
	System.out.println("Your withdrawing amount is ="+Amount); 	
 	accBalance -= Amount;									
	
   }
     public void getAmount()	// fourth method 					
    {
	  System.out.println(accHolderName+" Raj You Have "+accBalance+" in Your Account");
    }
}
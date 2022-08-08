
package ps.priyanshu; // it is our package 

import java.util.Scanner; // Scanner class
import ps.priyanshu.*; // here we import our package in which our sub class or customer class is store

class banker // This is our main class 
{
 public static void main (String args []) // this is our main methid  
 {
     Scanner scan = new Scanner(System.in); // it is a Scanner object
	 System.out.println("Enter account holder name = ");
	 String userName=scan.next();  // here we read account holder name from user
	 System.out.println("Enter your account number = ");
	 int accountNum = scan.nextInt(); // here we read account number from user 
	 System.out.println("Enter your account balance = ");
	 int accountbal = scan.nextInt(); // here we read account balance
	 System.out.println("Enter amount = ");
	 int amount = scan.nextInt();   
 
     customer user = new customer(); // it is object of our sub class or customer class
	 user.creatAccount(userName,accountNum,accountbal); // sub class object is use for get deatils from creatAccount method 
	 user.depositeAmount(amount); // sub class object  is use for get details from depositeAmmount method
	 user.withdrawAmount(amount); //ub class object  is use for get details from withdrawAmmount method
	 user.getDetail();  // user object is use for get details from getDetails method
	 scan.close();  // close scanner object
 }
}

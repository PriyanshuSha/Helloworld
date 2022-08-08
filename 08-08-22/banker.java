
package ps.priyanshu;

import java.util.Scanner;
import ps.priyanshu.*;

class banker
{
 public static void main (String args [])
 {
     Scanner scan = new Scanner(System.in);
	 System.out.println("Enter account holder name = ");
	 String userName=scan.next();
	 System.out.println("Enter your account number = ");
	 int accountNum = scan.nextInt();
	 System.out.println("Enter your account balance = ");
	 int accountbal = scan.nextInt();
	 System.out.println("Enter amount = ");
	 int amount = scan.nextInt();
 
     customer user = new customer();
	 user.creatAccount(userName,accountNum,accountbal);	
	 user.depositeAmount(amount);
	 user.withdrawAmount(amount);
	 user.getDetail();
	 scan.close();
 }
}
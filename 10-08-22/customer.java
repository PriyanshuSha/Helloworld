/* This a java program for authentification of Mr. Priyanshu*/


import java.util.Scanner;                  // Scanner class 
import static java.lang.System.*;
class customer
{
  public static void main (String...args)
  {
     Scanner ps=new Scanner(System.in);   // Scanner object
	 out.println("Please enter your username : ");
	 String username=ps.next();           // here we read username from user by using Scanner object
	 String name=username.substring(0);
	 
	 String bs=(name);                    // name= entered name by user 
	 String bs1="Priyanshu";              // Priyanshu is saved name of user in the system
	 if(bs.equalsIgnoreCase(bs1))         // here we check both name is same or not 
	 {
		 out.println("You are a valid user :\n ");
		 switch(1)
		 {
			case(1): out.println("Please enter your password : \n"); 
			String password=ps.next();    // read password from user using Scanner object
	        String pswd=password.substring(0);
			
			 String ds=(pswd);            // pswd is that password which entered by user 
	         String ds1="Priyanshu123";   // Priyanshu123 is that password which is saved in the system
			 if(ds.equalsIgnoreCase(ds1)) // here we check both password is same or not 
			                              // This statment is throw when password is right
			 {
				out.println(" Wlecome Mr.Priyanshu "); 
			 }
			  else                        // This statment is throw when password is wrong
			  {
				out.println("You entered a wrong password   please check! ");   
			  }
				
			
	  					 
		 }
	 }
	  else{                              // This statment is throw when username is wrong
		   out.println("Please enter a valid username  ");
		   
	  }
	  
	  ps.close();                        // close Scanner object  
  }

}

/*  This is a java program of using packages */

package ps.priyanshu; // it is our package 

class customer //  it is our Sub class
{
   int accountNum,accountbal,amount;
   String userName;
   
   public  void creatAccount(String name, int num, int bal) // it is creatAccount method in which user enter details which is neccessary for account creation
   {
    userName=name;
	accountNum=num;
	accountbal=bal;
	}
	
	public void withdrawAmount(int ammount) // it is withdrawAmount method for delete balance from ammount
	{
	  accountbal-=ammount;
	  System.out.println(userName+" this is your account balance Rs "+accountbal+" after withdrwaing = Rs "+ammount);
	  
	}

    public void depositeAmount(int ammount)  // it is a depositeAmount method for add amount in balance
	{
	  accountbal+=ammount;
	  System.out.println(userName+" this is your account balance Rs "+accountbal+" after depositing = Rs "+ammount);
	  
	}
  
     public void getDetail()  // it is a method for display account holders account details
	 {
		System.out.println(" Here is your complete account info");
		System.out.println("Account holder name is = "+ userName );
		System.out.println("Account number is = "+accountNum);
		System.out.println("Account balance is = Rs "+accountbal);
	}
}

/*  This is a java program of using packages */

package ps.priyanshu;

class customer
{
   int accountNum,accountbal,amount;
   String userName;
   
   public  void creatAccount(String name, int num, int bal)
   {
    userName=name;
	accountNum=num;
	accountbal=bal;
	}
	
	public void withdrawAmount(int ammount)
	{
	  accountbal-=ammount;
	  System.out.println(userName+" this is your account balance Rs "+accountbal+" after withdrwaing = Rs "+ammount);
	  
	}

    public void depositeAmount(int ammount)
	{
	  accountbal+=ammount;
	  System.out.println(userName+" this is your account balance Rs "+accountbal+" after depositing = Rs "+ammount);
	  
	}
  
     public void getDetail()
	 {
		System.out.println(" Here is your complete account info");
		System.out.println("Account holder name is = "+ userName );
		System.out.println("Account number is = "+accountNum);
		System.out.println("Account balance is = Rs "+accountbal);
	}
}

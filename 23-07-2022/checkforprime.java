// checForPrime

class checkForPrime
{
  
  public static void main (String args [])
  {
  
    int num=17,coef=0;
    for(int i=1;i<=num;i++)	
    {
	   if(num%i==0)
	   {
	      coef++;
	   }
	
	}
	if(coef==2)
	{
	 System.out.println(num+" is a prime");
	}
	else
	{
	 System.out.println(num+" is not a prime");
	
	}
	
  }

}
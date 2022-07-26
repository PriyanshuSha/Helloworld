// This is a program for check a number is a prime or not .


class primeNumber
{
	public static void main(String args[])
	{
		int num = 10;
		int m = num/2;
		if (num==0 || num ==1)
		{
			System.out.println("not a prime number");
		}
		else 
		{
			for (int i=2; i<=m; i++)
			{
				if (num%i == 0)
				{
				     System.out.println(num+"is not a prime number ");
				       break;
				}
				else 
				{
				     System.out.println(num+"is a prime number ");
				       break;
				}
			}
		}
	}
} 
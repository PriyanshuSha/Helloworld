// This a Program to find sum of N odd numbers

import java.util.Scanner;

class sumOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of numbers between which you want to get the sum of odd numbers :");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i<=n; i++)
		{
			if (i%2 != 0)
			{
				sum += i;// add odd number
			}

		}
		System.out.println("Sum = "+sum);// prints sum of N odd numbers
	}

} 
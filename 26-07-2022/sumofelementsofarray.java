//This is a java program for sum of the elements of array

import java.util.*;

class sum
{

	public static void main(String args[])
	
	{
	
	  System.out.println("enter the size of array = ");
	  
	  Scanner ps= new Scanner(System.in);
	  
	  int size =ps.nextInt();
	  
	  int number[] = new int[size];
	  
	  int sum =0;
	  
	  System.out.println("enter the element of array");
	
		for(int i=0;i<size;i++)
		
		{
		
		  number[i] =ps.nextInt();
		  
		  sum=sum +number[i];
	
		}
		
		  System.out.println("sum of the element of the array is = " + sum);	
		
	}
}
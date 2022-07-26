// This is a java program for a descending order of array elements


import java.util.*;

 class descendingOrder
{

  public static void main(String args[])
 {
	
	 Scanner ps = new Scanner(System.in);
	 
	 System.out.println("Enter the size of the array = ");
	 
	 int size = ps.nextInt();

	
	int arr[] = new int[size];
	
	System.out.println("Enter "+size+" elements = ");
	
	 for (int i=0;i<size;i++)
	{
		arr[i] = ps.nextInt();
	}
	  sorting(size,arr); 
	  
	  System.out.println(" \n ");
 }


  public static void sorting(int size,int arr[])
 {
	for(int i=0;i<size;i++)
	{
		for(int j= i+1;j<size;j++)
		{
			
			if(arr[i]<arr[j])
			{
				int temp = arr[i];
				
				arr[i]= arr[j];
				
				arr[j]= temp;
			}
		}
	}
	         System.out.println("Now it is arrange in a descending order ");

	
	  for(int p: arr)
	{
		     System.out.print(p+" ");
	}
 }
} 
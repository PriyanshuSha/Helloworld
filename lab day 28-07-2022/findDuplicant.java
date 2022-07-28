// This is a java program for find a duplicant in a array 

import java.util.Scanner;

public class findDuplicant 
{
  public static void main (String args [])
  {
     Scanner ps=new Scanner(System.in); // Scanner class
	 System.out.println("Enter the length of the array in which you find duplicant");
	 int len=ps.nextInt(); // read length of the array
	 int[] ar=new int[len];
	 int count=0;
	 
	    System.out.println("Enter the values in the array");
	  for(int i=0;i<ar.length;i++)
	  {
	    ar[i]=ps.nextInt();
	  
	  }

        System.out.println("these are the numbers of duplicant in given array");
       for(int i=0;i<ar.length;i++)
       {
	     for(int j=i+1;j<ar.length;j++)
		 {
		  if (ar[i]==ar[j])
		     ++count;
		 }
	   }
        System.out.println(count); // show the output
       
        scanner.close();	 // closing Scanner 
  }  
} 
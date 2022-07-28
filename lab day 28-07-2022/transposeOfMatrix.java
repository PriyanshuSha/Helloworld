// This is a java program for transpose of matrix

import java.util.Scanner;

public class transposeOfMatrix // main class
{
  public static void main (String args []) // main method
  {
    int i,j;
	System.out.println("Enter number of rows and columns");
	Scanner ps=new Scanner(System.in); // Scanner object
	int rows=ps.nextInt(); // rows
	int columns=ps.nextInt(); // columns
	int ar[][]=new int[rows][columns];
	
	// it is for enetering the elements in a array 
	System.out.println("Enter elements in the matrix");
	for(i=0;i<rows;i++)
	{
	  for(j=0;j<columns;j++)
	  {
	    ar[i][j]=ps.nextInt();
	  }
	   
	}
	  
	  // here form a new array with help of entered elements
	 System.out.println("new array");
	 for(i=0;i<rows;i++)
	  {
	    for(j=0;j<columns;j++)
	     {
	       System.out.println(ar[i][j]+"  ");
	     }
	       System.out.println("  ");
	  }
	  
	  // here we can see the transpose of our matrix
       System.out.println("Here is the transpose of given Matrix");
       for(i=0;i<columns;i++)
	  {
	    for(j=0;j<rows;j++)
	     {
	       System.out.println(ar[i][j]+"  ");
	     }
         
	  }
       Scanner.close();//closing Scanner 
  }
}
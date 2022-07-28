/* This is a java program for multiplication of two matrix/arrays */

import java.util.*;
 class multiplicationMatrix
{
 public static void main(String args [])
 {
   int rows,columns,i,j,k;
   Scanner ps=new Scanner(System.in); // This is a scanner object
   System.out.print(" Enter the numbers of rows ");
   rows=ps.nextInt();
   System.out.print(" Enter the numbers of columns ");
   columns=ps.nextInt();
   
   // creating array with specified size
   int ar[][]=new int[rows][columns];
   int br[][]=new int[rows][columns];
   int cr[][]=new int[rows][columns];
   
   // reading values of first array
   System.out.println(" Enter the values of first array");
   for(i=0;i<rows;i++)// rows
   {
      for(j=0;j<columns;j++)//columns
	  {
	    ar[i][j]=ps.nextInt();
	  
	  }
   
   }
    
   
   System.out.println(" Enter the values of second array");
    // reading values from second array
   for(i=0;i<rows;i++)//rows
   {
      for(j=0;j<columns;j++)//columns
	  {
	    br[i][j]=ps.nextInt();
	  
	  }
   
   }
   
   // multiplication of two array of matrix
   for(i=0;i<rows;i++)//rows
   {
      for(j=0;j<columns;j++)//columns
	  {
	    cr[i][j]=0;
		for(k=0;k<columns;k++)
		{
		  cr[i][j]+=ar[i][k]+br[k][j];// main logic
		}
	  
	  }
   
   }
   
   
  //priting values of result
    System.out.println("This is a result of your addition of two matrix");
	for(i=0;i<rows;i++) // rows
   {
      for(j=0;j<columns;j++)// columns
	  {
	    System.out.print(cr[i][j]+"  ");
	  
	  }
        System.out.println("  ");
   }
     ps.close();// close scanner object
 }



}
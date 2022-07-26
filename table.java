
// This is a java program for a table


import java.util.Scanner;

class table
{
  public static void main(String args[])
 {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the number of table :");
	
	int num = sc.nextInt();
	
	System.out.println("set the limit : ");
	
	int limit = sc.nextInt();

	for(int i=1;i<=limit;i++)
	{
		System.out.print(num+" X " +i+ " = ");
		
		int table = num*i;
		
		System.out.println(table);
 	}

 }
  

} 
//This is a java program for find a second biggest number from numbers of java

class secondBiggest

{
	public static void main(String args[])
	
	{
	
	  int temp, size;
	  
	  int number[] ={ 22,25,40,70,88};
	  
	  size = number.length;
	
	 for(int i=0; i<size; i++)
	
	{
		 for(int j= i+1;j<size;j++)
		 
		{
		
		 if(number[i]>number[j])
		 
		    {
			  temp=number[i];
			  
			  number[i] =number[j];
			  
			  number[j] =temp;
			}
		}   
	
	}

		System.out.println("Second Biggest Number is = " +number[size-2]);
	}
}
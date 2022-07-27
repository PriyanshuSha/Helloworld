//takeOutputFromUser
import java.util.*;
class scanner 
{

 public static void main (String args [])
{
   Scanner ps=new Scanner (System.in);
   
   System.out.println ("Enter a value");

   int num=ps.nextInt();
      if(num%2==0)
	  {
	  
	    System.out.println (num+" number is even");
	  
	  }
       else
	   {
	   
	   System.out.println (num+" number is odd");
	   
	   }
        ps.close();
}

}
/* This is a java program for calculator which is performing addition
multiplication,substraction*/


class calculator // this our main class
{
 public static void main (String args []) // this is our main method
 {
    calculator cal=new calculator(); // this object of our main class
	cal.addition(2,5);      // here we call addition method 
	cal.substraction(5,2);  // here we call substraction method 
	cal.multiplication(2,4); // here we call multiplication method 
 }
   
   // it is our sub method addition
 public static void addition(int...ps)
 {
  int sum=0;
  for(int i:ps)
  {
    sum+=i;
  }
    System.out.println(" Here the sum of your numbers  "+sum);
 }
   // it is our sub method substraction
 public static void substraction(int...ps)
 {
  int sub=0;
  for(int i:ps)
  {
    sub=i-sub;
  }
    System.out.println(" Here the substract of your numbers  "+sub);
 }
   // it is our sub method multiplication
   public static void multiplication(int...ps)
 {
  int mul=1;
  for(int i:ps)
  {
    mul=mul*i;
  }
    System.out.println(" Here the multiply of your numbers  "+mul);
 }
}
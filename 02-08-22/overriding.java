/* This is a java program for a method overriding */

class RBI // parent class 
{
  public void insurance()
  {
    System.out.println(" hii this your insurance team from RBI ");
  }

}

// SBI is a child class which is extends the property of its parent class
class SBI extends RBI
{ 
 public void insurance()
 {
	 super.insurance(); // super keyword is use for call a perent method
    System.out.println(" This is your insurance team from SBI");
 }
  
  public void fixdiposite()
  {
   System.out.println(" This is a fixdiposite team");
  }
}

 class bank // main class 
 {
  public static void main (String...args)
  {
    SBI ps=new SBI(); // object of a child class 
	ps.insurance();
	ps.fixdiposite();
	
  }
 }
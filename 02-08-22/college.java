/* This is a java program for a constructor over loading */

import static java.lang.System.*;
class college // main class 
{
 public static void main(String args [])
 {
   student ps=new student("Priyanshu"); // object of subclass
 }

}

class student // sub class 
{
  student(String name) // constructor 1
  {
    out.println(" Hii mr. "+name);
  }
  student(String name1,String name2) // constructor 2
  {
    out.println("Hii mr."+name1+" and "+name2);
  }
}
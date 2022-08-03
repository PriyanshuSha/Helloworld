/* This is a java program for aggregration */

class author
{
  String authorName;
  int authorAge;
  String authorCity;
  
  author(String Name,int Age,String City)
  {
     authorName=Name;
	 authorAge=Age;
	 authorCity=City;
  }

}
class book
{
  int bookId;
  int bookPrice;
  String bookName;
  author bookAuthor;
  
  book(int Id,int Price,String Name,author Authr)
  {
    bookId=Id;
	bookPrice=Price;
	bookName=Name;
	bookAuthor=Authr;
  }
    public void getBook()
	{
	  System.out.println("your book "+bookName+"book id is "+bookId+"and price of the book is "+bookPrice+"and the author of the book is "+bookAuthor.authorName);
	
	}
}
 
 class library
 {
  public static void main (String args[])
{
   author Au1=new author("Ramcharan",34,"Banarash");
   book bk1=new book (0002,205,"The only one",Au1);
   bk1.getBook();

}  
 
 
 }
 
 
 
 
 
 
 

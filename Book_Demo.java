import java.util.*;
class Book
{
 public String name;
 public String author;
 public int price;
 public int num_pages;
 
  public void display_details()
  {
   System.out.println("Name of the book="+name);
   System.out.println("Author of the book="+author);
   System.out.println("price of the book="+price);
   System.out.println("Number of pages in the book="+num_pages);
  }
  public void set_details()
  { 
   Scanner s=new Scanner(System.in);
   System.out.println("enter name of book");
   name=s.nextLine();
   System.out.println("enter name of author");
   author=s.nextLine();
   System.out.println("enter the price of book");
   price=s.nextInt();
   System.out.println("enter the number of pages of book");
   num_pages=s.nextInt();
  }
 }

class Book_Demo
{
 public static void main(String args[])
 {
  int i,n;
  Scanner s=new Scanner(System.in); 
  Book b1=new Book();
  System.out.println("enter the no. of books");
  n=s.nextInt();
  for(i=1;i<=n;i++)
  {
   b1.set_details();
   b1.display_details();
  }
 }
}
 
   


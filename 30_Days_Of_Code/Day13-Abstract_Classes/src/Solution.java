/**
 *  Verdict : Accepted
 *  OJ : Hackerrank
 *  @author absakDev 
 *  @version 7 june, 2016
 */
import java.util.*;
abstract class Book
{
    String title;
    String author;

	public Book(String t,String a) {
		// TODO Auto-generated constructor stub
		  title=t;
	        author=a;
	}

	abstract void display();


}

/**
 * This class was the actual task of the problem
 * @author absakDev
 *
 */
class MyBook extends Book {
	private int price;
	public MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	void display() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
	
	
}
public class Solution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}

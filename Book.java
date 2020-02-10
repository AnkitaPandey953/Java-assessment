package javaTest;

import java.util.Scanner;


public class Book {
	private int bookId;
	private String bookName;
	public void setBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id");
		bookId = sc.nextInt();
		System.out.println("Enter Book Name");
		bookName = sc.next();
		System.out.println("Book Details Saved Successfully");
	}
	public Book getDetailsById(int book_id) {
		if(bookId == book_id) {
			return this;
		}
		else {
			return null;
		}
	}
		
	public void update(Book b,int Id,String name)
	{
		b.bookId=Id;
		b.bookName=name;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void display()
	{
		
		System.out.println("id=" + bookId);
		System.out.println("name=" + bookName);
	
	}

}

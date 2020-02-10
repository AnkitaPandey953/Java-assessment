package javaTest;


public class IssueBook {
	private int id;
	private int roll;
	private String studentName;
	private String bookName;
	public void setIssueBook(int id, int roll, String studentName, String bookName) {
		this.id = id;
		this.roll = roll;
		this.studentName = studentName;
		this.bookName = bookName;
	}
	public int getId() {
		return id;
	}
	public int getRoll() {
		return roll;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getBookName() {
		return bookName;
	}
	public void display()
	{
		System.out.println("Book Id="+id);
		System.out.println("Book Name="+bookName);
		System.out.println("Student Id="+roll);
		System.out.println("Student Name="+studentName);
	}

}


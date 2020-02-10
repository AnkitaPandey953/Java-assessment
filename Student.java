package javaTest;
import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	public void setStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll Number");
		roll = sc.nextInt();
		System.out.println("Enter Student Name");
		name = sc.next();
		System.out.println("Student Data Saved Successfully");
	}
	public Student getDetailsById(int student_id) {
		if(roll == student_id) {
			return this;
		}
		else {
			return null;
		}
	}

	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public void display()
	{
		System.out.println("roll=" + roll);
		System.out.println("name=" + name);
	}
	

}


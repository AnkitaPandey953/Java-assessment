package javaTest;

import java.util.Scanner;


public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=100,n,Id,i,id,ch,j,k,l,f=0;
		String name;
		int objectCountS = 0;
		int objectCountB = 0;
		int objectCountI = 0;
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[max];
		Book b[] = new Book[max];
		IssueBook ib[] = new IssueBook[max];
		do {
		System.out.println("Menu");
		System.out.println("1)Add Students\n2)Add Books\n3)Update\n4)Delete Books\n5)Can Issue Books To Students");
		System.out.println("6)Display List Of Students\n7)Search Student By Id and display List Of Books Issued to Student\n8)Search Book By Id and display List Of Student Books has Issued");
		System.out.println("9)Display List  Of Book");
		System.out.println("Enter Your Choice");
		n = sc.nextInt();
		switch(n)
		{
		case 1:
			s[objectCountS ] = new Student();
			s[objectCountS].setStudent();
			objectCountS++;
			break;
			
		case 2:	
			b[objectCountB] = new Book();
			b[objectCountB].setBook();
			objectCountB++;
			break;
			
		case 3:
			System.out.println("Enter Book Id To Change:");
			 Id = sc.nextInt();
			 System.out.println("Enter Changd Book Id ");
			 id = sc.nextInt();
			System.out.println("Enter Changed Book Name");
			name = sc.next();
			for(i=0;i<objectCountB;i++)
			{
				Book ac=b[i].getDetailsById(Id);
				if(ac != null)
					ac.update(b[i],id,name);
			}
			break;	
			
		case 4:	
			System.out.println("Enter Book Id To Delete:");
			 Id = sc.nextInt();
			 for(i=0;i<objectCountB;i++)
				{
					Book ac=b[i].getDetailsById(Id);
					if(ac != null)
					{
						b[i] = b[i+1];
						b[objectCountB] = null;
						objectCountB =objectCountB - 1;
					}
				}
				break;	
			 
		case 5:
			System.out.println("Enter Id of Student For Issue Book");
			Id = sc.nextInt();
			for(i=0;i<objectCountS;i++)
			{
				Student ac=s[i].getDetailsById(Id);
				if(ac != null)
				{
					System.out.println("Yes You Can Issue Book");
					System.out.println("If You Want To Issue Book Then Press 1");
					ch = sc.nextInt();
					if(ch==1) {
						for(j=0;j<objectCountB;j++)
						{
							if(b[j]!=null)
								b[j].display();
						}
						System.out.println("From Above Which Book You Want To Issue");
						System.out.println("Enter Id and Name Of That Book");
						id = sc.nextInt();
						name = sc.next();
						
						ib[objectCountI] = new IssueBook();
						ib[objectCountI].setIssueBook(id,Id,s[i].getName(),name);
						objectCountI++;
						for(k=0;k<objectCountI;k++) {
							ib[k].display();	
							}
						}
					}	
				}
									
			
			break;	
			
		
		case 6:
			for(i=0;i<objectCountS;i++)
			{
				s[i].display();
			}
			break;
			
		case 7:
			System.out.println("Enter Student Id");
			Id = sc.nextInt();
			for(j=0;j<objectCountI;j++)
			{
				if(Id == ib[j].getRoll())
				{
					
					System.out.println("Book Id="+ib[j].getId()+"  "+"Book Name="+ib[j].getBookName());
				}
				
			}
			break;
		case 8:
			System.out.println("Enter Book Id");
			Id = sc.nextInt();
			for(j=0;j<objectCountI;j++)
			{
				if(Id == ib[j].getId())
				{
					System.out.println("Student Id="+ib[j].getRoll()+"  "+"Student Name="+ib[j].getStudentName());
				}
				
			}
			break;
		case 9:
			for(i=0;i<objectCountB;i++)
			{
				if(b[i]!=null)
				b[i].display();
			}
			break;			
		}
		
		
		}while(true);

	}

}


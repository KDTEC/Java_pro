package inheritance;
import java.util.*;

public class School {
	public static void main(String args[])
	{
		Person o1=new Person();
		Student o2=new Student();
		Teacher o3=new Teacher();
		CollegeStudent o4=new CollegeStudent();
		o1.inputPerson();
		o2.inputStudent();
		o3.inputTeacher();
		o4.inputCollegeStudent();
		System.out.println();
		System.out.println();
		o1.displayPerson();
		o2.displayStudent();
		o3.displayTeacher();
		o4.displayCollegeStudent();
		
	}
}

class Person
{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	String gender;
	
	void inputPerson()
	{
		System.out.print("Enter person name: ");
		name=sc.nextLine();
		System.out.print("Enter person age: ");
		age=sc.nextInt();
		System.out.print("Enter person gender: ");
		gender=sc.next();
	}
	
	void displayPerson()
	{
		System.out.println("Person name is: "+name);
		System.out.println("Person age is: "+age);
		System.out.println("Person gender is: "+gender);
	}
}

class Student extends Person
{
	Scanner sc=new Scanner(System.in);
	int RegNo;
	String Dept;
	double CGPA;
	
	void inputStudent()
	{
		System.out.print("Enter Student name: ");
		name=sc.nextLine();
		System.out.print("Enter Student age: ");
		age=sc.nextInt();
		System.out.print("Enter Student gender: ");
		gender=sc.next();
		System.out.print("Enter Student Department: ");
		Dept=sc.next();
		System.out.print("Enter Student Registration no: ");
		RegNo=sc.nextInt();
		System.out.print("Enter Student CGPA: ");
		CGPA=sc.nextDouble();
	}
	
	void displayStudent()
	{
		System.out.println("Student name is: "+name);
		System.out.println("Student age is: "+age);
		System.out.println("Student gender is: "+gender);
		System.out.println("Student registration no is: "+RegNo);
		System.out.println("Student department is: "+Dept);
		System.out.println("Student CGPA is: "+CGPA);
	}
}

class Teacher extends Person
{
	Scanner sc=new Scanner(System.in);
	int Salary;
	String subject;
	
	void inputTeacher()
	{
		System.out.print("Enter Teacher name: ");
		name=sc.nextLine();
		System.out.print("Enter Teacher age: ");
		age=sc.nextInt();
		System.out.print("Enter Teacher gender: ");
		gender=sc.next();
		System.out.print("Enter Teacher subject: ");
		subject=sc.next();
		System.out.print("Enter Teacher salary: ");
		Salary=sc.nextInt();
	}
	
	void displayTeacher()
	{
		System.out.println("Teacher name is: "+name);
		System.out.println("Teacher age is: "+age);
		System.out.println("Teacher gender is: "+gender);
		System.out.println("Teacher salary is: "+Salary);
		System.out.println("Teacher subject is: "+subject);
	}
}

class CollegeStudent extends Student
{
	Scanner sc=new Scanner(System.in);
	int year;
	String Major;
	
	void inputCollegeStudent()
	{
		System.out.print("Enter College Student name: ");
		name=sc.nextLine();
		System.out.print("Enter College Student age: ");
		age=sc.nextInt();
		System.out.print("Enter College Student gender: ");
		gender=sc.next();
		System.out.print("Enter College Student Department: ");
		Dept=sc.next();
		System.out.print("Enter College Student Registration no: ");
		RegNo=sc.nextInt();
		System.out.print("Enter College Student CGPA: ");
		CGPA=sc.nextDouble();
		System.out.print("Enter College Student Major: ");
		Major=sc.next();
		System.out.print("Enter College Student year: ");
		year=sc.nextInt();
	}
	
	void displayCollegeStudent()
	{
		System.out.println("College Student name is: "+name);
		System.out.println("College Student age is: "+age);
		System.out.println("College Student gender is: "+gender);
		System.out.println("College Student registration no is: "+RegNo);
		System.out.println("College Student department is: "+Dept);
		System.out.println("College Student CGPA is: "+CGPA);
		System.out.println("College Student current year is: "+year);
		System.out.println("College Student major is: "+Major);
	}
	
}

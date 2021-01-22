package inheritance;
import java.util.*;
public class Gago 
{
	public static void main(String ar[])
	{
		Purchase ob=new Purchase();
		ob.input();
		ob.disp();
		ob.accept();
		ob.cal();
		ob.show();
	}
}
class E
{
	String title,author,publication;
	int price;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter title");
		title=sc.next();
		System.out.println("Enter author name");
		author=sc.next();
		System.out.println("Enter publication name");
		publication=sc.next();
		System.out.println("Enter price");
		price=sc.nextInt();
	}
	void disp()
	{
		System.out.println("Title is "+title);
		System.out.println("Author name is "+author);
		System.out.println("Publication name is "+publication);
		System.out.println("Price is "+price);
	}
}
class Purchase extends E
{
	int noc,amount;
	Scanner s=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter no of copies");
		noc=sc.nextInt();
	}
	void cal()
	{
		amount=noc*price;
	}
	void show()
	{
		System.out.println("No of copies is "+noc);
		System.out.println("Amount is "+amount);
	}
}

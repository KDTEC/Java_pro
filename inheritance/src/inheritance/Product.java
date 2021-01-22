package inheritance;

import java.util.Scanner;

public class Product 
{
	public static void main(String ar[])
	{
		Sale ob=new Sale();
		ob.getdata();
		ob.show();
		ob.input();
		ob.cal();
		ob.disp();
	}
}
class Goods
{
	public int pno;
	public String name;
	public int qnty;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter the product no ");
		pno=sc.nextInt();
		
		System.out.println("Enter the quantity ");
		qnty=sc.nextInt();
		System.out.println("Enter the product name ");
		name=sc.next();
	}
	void show()
	{
		System.out.println("Product number "+pno);
		System.out.println("Product name "+name);
		System.out.println("Quantity "+qnty);
	}
}
class Sale extends Goods
{
	double rate,amount;
	Scanner s=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter rate ");
		rate=s.nextDouble();
	}
	void cal()
	{
		amount=qnty*rate;
	}
	void disp()
	{
		System.out.println("Amount to be paid "+amount);
	}
}

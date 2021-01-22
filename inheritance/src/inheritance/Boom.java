package inheritance;
import java.util.*;
public class Boom 
{
	static public void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int rate,time,ac;
		float bal;
		System.out.println("Enter rate");
		rate=sc.nextInt();
		System.out.println("Enter time");
		time=sc.nextInt();
		System.out.println("Enter account no");
		ac=sc.nextInt();
		System.out.println("Enter balance");
		bal=sc.nextFloat();
		Cal ob=new Cal(ac,bal);
		ob.withdraw();
		ob.deposit();
		ob.accept(rate,time);
		ob.compute();
		ob.disp();
	}
}
class Account
{
	int acno;
	float balance;
	Scanner sc=new Scanner(System.in);
	Account(int a,float b)
	{
		acno=a;
		balance=b;
	}
	void withdraw()
	{
		int w;
		System.out.println("Enter the withdraw amt");
		w=sc.nextInt();
		balance-=w;
	}
	void deposit()
	{
		int d;
		System.out.println("Enter deposit amt");
		d=sc.nextInt();
		balance+=d;
	}
}
class Cal extends Account
{
	
	Cal(int a, float b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	int r,t;
	float si,amt;
	void accept(int x,int y)
	{
		r=x;
		t=y;
		amt=0;
	}
	void compute()
	{
		si=(balance*r*t)/100;
		amt=amt+si;
	}
	void disp()
	{
		System.out.println("Account no is "+acno);
		System.out.println("Balance is "+balance);
		System.out.println("Intrest rate is "+r);
		System.out.println("Amount is "+amt);
	}
}
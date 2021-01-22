package inheritance;
import java.util.*;
public class Calculator 
{
	private int result;
	int a;
	Calculator()
	{
		result=20;
	}
	void add(int b)
	{
		a=b;
		result+=a;
	}
	void sub(int b)
	{
		a=b;
		result-=a;
	}
	void mul(int b)
	{
		a=b;
		result*=b;
	}
	void div(int b)
	{
		a=b;
		result/=a;
	}
	void display()
	{
		System.out.println("The result is "+result);
	}
	void clear()
	{
		result=20;
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("Enter a no ");
		c=sc.nextInt();
		Calculator ob=new Calculator();
		ob.add(c);
		ob.display();
		ob.clear();
		ob.sub(c);
		ob.display();
		ob.clear();
		ob.mul(c);
		ob.display();
		ob.clear();
		ob.div(c);
		ob.display();
		ob.clear();
	}
}

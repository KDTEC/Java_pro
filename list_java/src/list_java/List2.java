package list_java;
import java.util.*;

public class List2 {
	public static void main(String a[])
	{
		List <String> al=new ArrayList<String>();
		al.add("Amit");
		al.add("Ram");
		al.add("Bob");
		al.add("Sam");
		
		ListIterator<String> itr = al.listIterator();
		System.out.println("Traversing elements in forward direction");
		while(itr.hasNext())
		{
			System.out.println("index: "+itr.nextIndex()+" value: "+itr.next());
		}
		System.out.println("Traversing elements in backward direction");
		while(itr.hasPrevious())
		{
			System.out.println("index: "+itr.previousIndex()+" value: "+itr.previous());
		}
	}

}

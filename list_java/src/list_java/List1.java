package list_java;
import java.util.*;
public class List1 {
	public static void main(String a[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		System.out.println("2nd element is: "+list.get(1));
		list.set(1,"Dates");
		
		//sorting the list
		Collections.sort(list);
		
		for(String f:list)
			System.out.println(f);
	}

}

package list_java;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		List<String> a=new ArrayList<>();
		List<String> b=new ArrayList<>();
		
		a.add("Apple");
		a.add("Mango");
		
		b.add("Potato");
		b.add("Tomato");
		
		a.addAll(b);
		a.set(3,"Avocado");
		
		System.out.println(a.get(1));
		System.out.println(a);
		System.out.println(b);
		
		//to clear the complete list at once
//		a.clear();
//		System.out.println(a);
		
		//to remove from 1 list ,using the other list
		List<String> new_list=new ArrayList<>();
		new_list.add("apple");
		new_list.add("Avocado");
		a.removeAll(new_list);
		System.out.println("Updated a: "+a);
		
		//to get the size of the list
		System.out.println("size is: "+a.size());
		
		System.out.println(a.contains("guava"));
		
		System.out.println(a.isEmpty());
		
		//to convert a list to array
		String temp[]=new String[a.size()];
		a.toArray(temp); 
		System.out.println("Array Elements are:");
		for(String e:temp) {
			System.out.println(e);
		}
		
		
	}

}

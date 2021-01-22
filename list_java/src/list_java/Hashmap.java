package list_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m=new HashMap<>();
		m.put("one",1);
		m.put("two",2);
		m.put("three",3);
		
		System.out.println(m.get("two"));
		
		m.putIfAbsent("one",10); /*It will only put if that key is already
									not associated with a value*/
		
		m.replace("two",2,20);/*It will replace the value associated
								with the the key only if it matches
								with the old value associated with 
								the key*/
		System.out.println(m.get("two"));
		System.out.println(m.get("one"));
		System.out.println(m.containsKey("three"));
		System.out.println(m.containsValue(2));
		
		System.out.println("keys are: "+m.keySet());
		System.out.println("values are: "+m.values());
		
		System.out.println("Entry set is: "+m.entrySet());
		
		Set<Entry<String, Integer>> s=m.entrySet();
		for(Entry<String , Integer> entry:s) {
			entry.setValue(entry.getValue()*100);
		}
		
		//m.remove("two");
		System.out.println(m);
	}

}

import java.util.*;
public class IterateMapUsingLambda {
	public static void main(String[] args) {
		Map<String, Integer> prices = new HashMap<>();
		prices.put("Apple", 50);
		prices.put("Orange", 20);
		prices.put("Banana", 10);
		/* Iterate without using Lambda
		   for (Map.Entry<String, Integer> entry : prices.entrySet()) {
		   System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
		   }
		*/ 
		prices.forEach((k,v)->System.out.println("Fruit: " + k + ", Price: " + v));
	}
}

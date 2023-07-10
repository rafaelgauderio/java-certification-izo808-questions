package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProgramMap {

	public static void main(String[] args) {
		
		Set<String> keys = new LinkedHashSet<String>(List.of("Ra","fa","el")); // no order, no repeated value 
		
		List<String> values = new ArrayList<String>(List.of("17","12","82")); // natural order
		
		Map<String, String > myMap = new HashMap<String,String>();
		
		System.out.println(keys);
		System.out.println(values);
		
		int count = 0;
		for(var key : keys) {
			myMap.put(key, values.get(count++));
		}

		System.out.println(myMap);
		System.out.println("keys size: " + keys.size());
		System.out.println("values size: " + values.size());
		System.out.println("\nPrinting map");
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		myMap.forEach((key, value) -> System.out.printf("key: %s value: %s | ", key,value));
		
		keys.clear();
		values.clear();
		
		System.out.println("\nSizes after clear");
		System.out.println(keys.size());
		System.out.println(values.size());
		System.out.println(myMap.keySet().size() + ", " + myMap.values().size());		
		myMap.forEach((key, value) -> System.out.printf("key: %s value: %s , ", key,value));
		myMap.clear();
		
		System.out.println("\n\nMap will be empty, only after clear the Map data structure");
		myMap.forEach((key, value) -> System.out.printf("key: %s value: %s | ", key,value));
		System.out.println(myMap.size());
		
		
	}

}

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
//		Map<String , Integer>  numbers = new HashMap<>() ;
		
		Map<String ,Integer> numbers = new TreeMap<>();  // it will give sorted map bases on key
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three",3);
		numbers.put("Four",6);
		numbers.put("Five",7);
		
//		numbers.put("two",9); // override in key value
		//to solve this we use
//		if(numbers.containsKey("two")) {
//		numbers.put("two",3);
//		}
//		numbers.putIfAbsent("two", 5);
		
		// remove element in treeMap
		System.out.println(numbers.remove("Two"));

		System.out.println(numbers);
		
		System.out.println(numbers.containsKey("one"));
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
//		System.out.println(numbers.clear()); // to clear the map
		
//		
//		for(Map.Entry<String, Integer> e: numbers.entrySet()) {
//			System.out.println(e);
//			
//			System.out.println(e.getKey());  //printing key only
//			System.out.println(e.getValue()); // printing value only
//		}
		
		for(String key :numbers.keySet()) {
			System.out.println(key);
		}
		
		for(Integer value:numbers.values()) {
			System.out.println(value);
		}
		
		
		

	}

}

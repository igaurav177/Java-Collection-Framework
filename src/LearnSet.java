import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();      // o(1) // random arragment in set
		
//		Set<Integer> set  = new LinkedHashSet<>();  // first element enter at first position
		
//		Set<Integer> set = new TreeSet<>(); //O(log(n)) // set is always in sorted format 
		
		set.add(23);
		set.add(32);
		set.add(2);
		set.add(43);
		set.add(21);
		set.add(99);
		
		System.out.println(set);
		
		set.remove(43);
		System.out.println(set); 
		
		System.out.println(set.contains(2));
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set);
		
		
		
	
		
		
		

		
	}



}

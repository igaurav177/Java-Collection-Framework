import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
public class LearnCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList();
		list.add(2);
		list.add(45);
		list.add(67);
		list.add(2);
		list.add(23);
		list.add(34);
		
		System.out.println("min element"+Collections.min(list));
		System.out.println("max element"+Collections.max(list));
		System.out.println(Collections.frequency(list,2));
		
		 Collections.sort(list);

		 System.out.println(list);
		 
		 Collections.sort(list,Comparator.reverseOrder());
		 
		  
		 
		 
		 
	}

}

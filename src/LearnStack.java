import java.util.*;
public class LearnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack<String> animals = new Stack<>();
			animals.push("lion");
			animals.push("dog");
			animals.push("Horse");
		    animals.push("cat");
		    
			System.out.println("Stack: "+animals);
			
			System.out.println(animals.peek());
			
			animals.pop();
			System.out.println("Stack: "+animals);
			
			System.out.println(animals.peek());
			
			
			
	}

}

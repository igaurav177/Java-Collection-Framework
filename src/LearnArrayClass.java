import java.util.Arrays;
public class LearnArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int numbers[] = {1,2,3,4,5,6,7,8,9,10};
//		int index = Arrays.binarySearch(numbers,4);
//		
//		System.out.println("the index of element 4 is "+index);
		
		//sorting of number in array
		
		Integer numbers[] = {10,34,2,24,6,99,65,35};
		Arrays.sort(numbers); // this method use quick sort
	
		 // Arrays.fill(numbers,12); //to fill all the postion with same number
		
		for(int i:numbers) {
			System.out.print(i+" ");
			
		}
		
		
		
		
		
		
	
	
	}

}

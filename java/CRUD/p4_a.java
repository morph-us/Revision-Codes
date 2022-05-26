

import java.util.*;

class Test{
	public static void main(String args[]){

		

		// //this works
		// int a[] = {1,5,625,3,9};
		// List l = Arrays.asList(a);
		// ArrayList<Integer> l1 = new ArrayList<Integer>(l);

		// System.out.println(l1);	
	


		
		
// //		this gives error	
// 		int a[] = {1,5,625,3,9};
// 		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));
// 		System.out.println(l1);
	

	// //this works but does not iterate , array is saved as one element i.e at 0th position
	
		int a[] = {1,5,625,3,9};
		ArrayList<Integer> l1 = new ArrayList(Arrays.asList(a));
		System.out.println(l1);
	

	

// //this works coorectly	

		// Integer a[] = {1,5,625,3,9};
		// ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));
		// System.out.println(l1);
	


	}
}

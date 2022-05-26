//ways to convert array into collection

import java.util.*;
import java.util.stream.*;

class Test{
	public static void main(String args[]){



		//Method 0 : manualy add each int into Collection
		int[] arr = {1,3,5,6,99,876};


// //Integer[] to list
// 		Integer[] a = {1,2,3,4,5};		
// 		ArrayList<Integer> l = new ArrayList(Arrays.asList(a));
// 		System.out.println(l);


		// ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(1,4,5,6,6));
 	// 	System.out.println(l);


		ArrayList<Integer> l = Arrays.asList(1,4,5,6,6);
 		System.out.println(l);




	//	String b[] = {"Hello","this ","is","an","array"};
			


		// //Method 3
		
		// //List<Integer> l2 = Arrays.stream(arr).map(x->(Integer)x).boxed().collect(Collectors.toList());
		
		
		// ArrayList<Integer> l2 = Arrays.stream(arr).map(x->(Integer)x).boxed().collect(Collectors.toCollection(ArrayList::new));
	

		// //ArrayList<Integer> l3 = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));

		// //ArrayList<String> l3 = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));

	
		// System.out.println(l2);
		// System.out.println(l3);

	
	}
}

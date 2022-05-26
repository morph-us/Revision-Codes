//ways to convert array into collection

import java.util.*;
import java.util.stream.*;

class Test{
	public static void main(String args[]){



		int[] arr = {1,3,5,6,99,876};

		Integer[] a = { 1,2,3,3,3,};
		//List<Integer> l2 = Arrays.stream(arr).map(x->(Integer)x).boxed().collect(Collectors.toList());
		
		ArrayList<Integer> l2 = Arrays.stream(arr).map(x->(Integer)x).boxed().collect(Collectors.toCollection(ArrayList::new));


		ArrayList<Integer> l3 = Arrays.stream(a).map(x->(Integer)x).collect(Collectors.toCollection(ArrayList::new));


		//ArrayList<Integer> l3 = Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));

		//ArrayList<String> l3 = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));

	
		System.out.println(l2);
		System.out.println(l3);

	
	}
}

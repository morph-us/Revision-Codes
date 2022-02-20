//converting collection to array

import java.util.*;

class Test{
	public static void main(String args[]){
		//List interface have toArray() method, so all list based collection can be converted to array using toArray() method
		
		Integer a[] = {1,5,625,3,9};

		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));

		Vector<Integer> l2 = new Vector<Integer>(l1);



		System.out.println(l2);

		Integer arr[] = l2.toArray(new Integer[0]);
	
		System.out.println(Arrays.toString(arr));


	}
}

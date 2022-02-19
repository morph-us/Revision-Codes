//converting collection to array

import java.util.*;

class Test{
	public static void main(String args[]){

		
		Integer a[] = {1,5,625,3,9};
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));

		Vector<Integer> l2 = new Vector<Integer>(l1);

		System.out.println(l2);
//		Integer arr[] = (Integer[])l2.toArray();


		Integer arr[] = l2.toArray(new Integer[0]);





		System.out.println(arr);



	}
}

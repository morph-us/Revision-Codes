//converting collection to array

import java.util.*;

class Test{
	public static void main(String args[]){

		
		Integer a[] = {1,5,625,3,9};
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));

		Vector<Integer> l2 = new Vector<Integer>(l1);

		System.out.println(l2);
		

		//int arr[] = l2.toArray(new int[0]); not used for primitive types
	 

		// //Method 1
		// Object arr[] = l2.toArray();
		
		////Method 1
		//Integer arr[] = l2.toArray(new Integer[0]);
		
		System.out.println(arr);
		for(Object i:arr){
			int k = (int)i;
		
			System.out.println(k);
			//System.out.println(new Integer(i));
		}



	}
}

//converting collection to array

import java.util.*;

class Test{
	public static void main(String args[]){
		//List interface have toArray() method, so all list based collection can be converted to array using toArray() method
		
		Integer a[] = {1,5,625,3,9};

		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));

		Vector<Integer> l2 = new Vector<Integer>(l1);

		Set<Integer> s = new TreeSet<Integer>(l2);

		ArrayList<Integer> l = new ArrayList<Integer>(s);


		//M-1 
		Integer ax[] = l1.toArray(new Integer[0]);

		//M0
		Integer arr[] = l.stream().toArray(Integer[]::new);	
		System.out.println(Arrays.toString(arr));

		//M1
		int[] intAr = l.stream().mapToInt(i->i*i).toArray();
		System.out.println(Arrays.toString(intAr));
	
		//M2
		int[] example2 = l.stream().mapToInt(Integer::intValue).toArray();	



	}
}

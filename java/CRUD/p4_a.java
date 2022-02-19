

import java.util.*;

class Test{
	public static void main(String args[]){

		

		//this works
		int a[] = {1,5,625,3,9};
		List l = Arrays.asList(a);
		ArrayList<Integer> l1 = new ArrayList<Integer>(l);

		System.out.println(l1);	
	


		
		
/*
		int a[] = {1,5,625,3,9};
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(a));
	
	
		//this gives error	
*/


	}
}

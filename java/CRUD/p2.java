//ways to convert array into collection

import java.util.*;
import java.util.stream.*;

class Test{
	public static void main(String args[]){

	/*	
	 *	This method works but does not print list elements direcltly while printling list
		int a[] = {1,5,625,3,9};
		List l = Arrays.asList(a);
		ArrayList<Integer> l1 = new ArrayList<Integer>(l);

	*/



		//Method 0 : manuall add each int into Collection
		int[] arr= {1,3,5,6,99};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int e:arr){
			al.add(e);
		}
		System.out.println(al);




	
		Integer[] a = {1,2,3,4,5};
			


		//Method 1
		List<Integer> l = Arrays.asList(a);//returns a fixed length list, cant add
	
	
	
		//Method 2
		List<Integer> l1 = new ArrayList<Integer>();
		Collections.addAll(l1,a);
	//	Collections.addAll(l1,arr);



		//Method 3
		
		//List<Integer> l2 = Arrays.stream(arr).map(x->(Integer)x).boxed().collect(Collectors.toList());
		
		
		ArrayList<Integer> l2 = Arrays.stream(arr).map(x->(Integer)x).boxed().collect(Collectors.toCollection(ArrayList::new));
	

		ArrayList<Integer> l3 = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
	//boxed changed int to Integer
	

		//M4
		Arrays.stream(arr).forEach(l2::add);

	//	ArrayList<Integer> l2 = Arrays.stream(arr).map(x->(Integer)x).boxed().collect(Collectors.toCollection(new ArrayList()));//error new ArrayList() != ArrayList::new as its a supplier 
		System.out.println(l2);
	
	}
}

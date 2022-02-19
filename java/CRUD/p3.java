//ways to conveert 
//
//
import java.util.*;

class Test{
	public static void main(String args[]){
		
		Integer[] a = {1,2,3,4,5};

		List<Integer> l1 = new ArrayList<Integer>();
		Collections.addAll(l1,a);
	

		ArrayList<Integer> l2 = new ArrayList<Integer>(l1);
		
		LinkedList<Integer> l3 = new LinkedList<Integer>(l1);


		Vector<Integer> l4 = new Vector<Integer>(l1);


//		Deque<Integer> l5 = new Deque<Integer>(l1);
			

		ArrayDeque<Integer> l6 = new ArrayDeque<Integer>(l1);


		
//		SortedSet<Integer> l7 = new SortedSet<Integer>(l1);
		
		TreeSet<Integer> l8 = new TreeSet<Integer>(l1);



//	HashSet<Integer> l9 = new HashSet<Integer>(l1);



		LinkedHashSet<Integer> l7 = new LinkedHashSet<Integer>(l1);




		System.out.println(l1);


	}
}

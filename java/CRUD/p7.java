//converting set to array

import java.util.*;
import java.util.stream.*;

class Test{
	public static void main(String args[]){
		int a[] = {1,5,625,3,9,1,3};

		ArrayList<Integer> l = new ArrayList<Integer>();
		
		Arrays.stream(a).forEach(l::add);
		System.out.println(l);


		//converting array to set
		Set<Integer> s = new TreeSet<Integer>();
		Arrays.stream(a).boxed().forEach(s::add);	


		Set<Integer> s1 = Arrays.stream(a).boxed().collect(Collectors.toCollection(TreeSet<Integer>::new));
		System.out.println(s1);


		//converting set to array
		int[] b = s1.stream().mapToInt(x->x).toArray();
		Integer[] c = s1.stream().toArray(Integer[]::new);
//		Object[] c = s1.stream().toArray();



		System.out.println(b);
		System.out.println(c);

	}
}

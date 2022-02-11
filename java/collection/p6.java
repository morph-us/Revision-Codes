import java.util.*;


class Test{
	public static void main(String args[]){
		
		Integer[] a = new Integer[]{44,3,32,11,34,66,44,3};

		TreeSet l = new TreeSet();
		Collections.addAll(l,a);
		System.out.println(l);


		List al = new ArrayList(l);

		System.out.println(al);


		System.out.println(Collections.binarySearch(al,9));
		System.out.println(Collections.binarySearch(al,1));
		System.out.println(Collections.binarySearch(al,11));

		




	}
}

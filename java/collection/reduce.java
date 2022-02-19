import java.util.*;
import java.util.stream.*;




class Test{
	public static void main(String args[]){

		List<Integer> l = Arrays.asList(2,3,1,6,7,9);
		List<Integer> l1 = new ArrayList<Integer>();		
		
		int k = l.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		l.stream().filter(x->x%2==0).reduce((ans,i)->ans+i).ifPresent(System.out::println);
		
		
		int m = l1.stream().filter(x->x%2==0).reduce((ans,i)->ans+i).orElse(-2);
	

		int n = l.stream().filter(x->x%2==0).reduce((ans,i)->ans+i).get();
	
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);

	}
}

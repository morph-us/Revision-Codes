import java.util.*;
import java.util.stream.*;




class Test{
	public static void main(String args[]){

		List<Integer> a = Arrays.asList(2,3,1,6,7,9);
		List<Integer> l1 = new ArrayList<Integer>();		
		
		Integer k = l1.parallelStream().filter(x->x%2==0).reduce((ans,i)->ans+i).orElse(1);
		int l = l1.parallelStream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		int m = l1.parallelStream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i,Integer::sum);



	
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);



	}
}

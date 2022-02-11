import java.util.*;
import java.util.stream.*;




class Test{
	public static void main(String args[]){

		List<Integer> l = Arrays.asList(2,3,1,6,7,9);
		
	
		int s = l.parallelStream().reduce(1,(ans,i)->ans*i);
		int m = l.parallelStream().reduce(1,(ans,i)->ans*i,(p,q)->p*q);
		System.out.println(s);
		System.out.println(m);

	}
}

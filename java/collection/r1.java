import java.util.*;
import java.util.stream.*;




class Test{
	public static void main(String args[]){

		List<Integer> l = Arrays.asList(2,3,1,6,7,9);
		List<Integer> l1 = new ArrayList<Integer>();		
		
		
		
		
		int m = l.stream().filter(x->{
			return true;}
			).reduce((ans,i)->ans+i).orElse(-2);
		

	//int m = l.stream().filter(x->{
			return new String("hello");}
			).reduce((ans,i)->ans+i).orElse(-2);
		

		//int n = l1.stream().filter(x->x%2==0).reduce((ans,i)->ans+i).orElse(-2);
		

	
		System.out.println(m);

		//System.out.println(n);
	
	}
}

import java.util.*;
import java.util.stream.*;




class Test{
	public static void main(String args[]){

		List<Integer> l = Arrays.asList(2,3,1,6,7,9);
		
		l.stream().forEach(y->{System.out.print("num :"+y);
			System.out.println(" square : "+ (y*y));
		});



		int k = l.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(k);

	}
}

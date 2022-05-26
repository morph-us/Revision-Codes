
//USING Collection class to add elements
import java.util.*;

class Test{
	public static void main(String args[]){
		
		int a[] = foo();
	
		for(int i:a){
			System.out.print(i+" ");
		}
	}

	public static int[] foo(){
	
		int ar[] = {12,23,13,04};
		TreeSet<Integer> l = new TreeSet<Integer>();

		for(int a:ar){
			l.add(a);
		}

		
		System.out.println(l);
		System.out.println(l.contains(8));
		System.out.println(l.contains(4));



		Integer b[] = {32,44,8,1};
		Collections.addAll(l,b);




		System.out.println(l);
		System.out.println(l.contains(8));
		System.out.println(l.contains(4));
		

		int n = l.size();
		int r[] = new int[n];
		
		int i=0;
		for(int k:l){
			r[i++] = k;
		}
		
		return r;




	}

}

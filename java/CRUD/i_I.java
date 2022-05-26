//ways to convert int[] into Integer[]
import java.util.*;
import java.util.stream.*;

class Test{
	public static void main(String args[]){


		int[] arr= {1,3,5,6,99};
		////m1
		//Integer[] a = Arrays.stream(arr).map(x->(Integer)x).boxed().toArray(Integer[]::new);
		

		////m2 
		//Integer[] a = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		Object[] a = Arrays.stream(arr).boxed().toArray();
		

		System.out.println(Arrays.toString(a));


		//now do reverse
		//
		Integer[] b ={1,3,4,5};



	}
}

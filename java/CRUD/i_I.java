//ways to convert int[] into Integer[]
import java.util.*;
import java.util.stream.*;

class Test{
	public static void main(String args[]){


		int[] arr= {1,3,5,6,99};
	
		Integer[] a = Arrays.stream(arr).map(x->(Integer)x).boxed().toArray(Integer[]::new);


		System.out.println(Arrays.toString(a));
	}
}

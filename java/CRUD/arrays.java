import java.util.*;

class Test{
	public static void main(String args[]){
		
		int[] a = {19,132,23,4,65};

		System.out.println(Arrays.toString(a));
		
		//SORTING
		//M1  this uses DualPivotQuicksort
		Arrays.sort(a);


		//M2 uses parallel sort-merge
		Arrays.parallelSort(a);

		System.out.println(Arrays.toString(a));


		//SEARCHING 
		 //elements must be sorted before searching
		 //

		System.out.println(Arrays.binarySearch(a,132));
		System.out.println(Arrays.binarySearch(a,191));


		//copy array to another array
		//m1
		int [] a1 = Arrays.copyOfRange(a,2,5);

		//m2
		a1 = Arrays.copyOf(a,2);


		//m3
		int[] b = new int[4];
		System.arraycopy(a,0,b,0,3);


		System.out.println(Arrays.toString(b));
		


	}
}

// Java program to print first half in
// ascending order and the second half
// in descending order
import java.util.*;

class GFG
{
// function to print half of the array in
// ascending order and the other half in
// descending order
static void printOrder(int[] arr, int size)
{
	

  	int mid = size/2+1;		
     	int[] begArr = Arrays.copyOfRange(arr, 0, mid);
     	int[] endArr = Arrays.copyOfRange(arr, mid,size);
  
  	Arrays.sort(begArr);
  	Arrays.sort(endArr);
  

	for (int i = 0; i < mid; i++)
		System.out.print(begArr[i]+" ");


	for (int j = size-mid-1; j >= 0; j--)
		System.out.print(endArr[j]+" ");


}

// Driver code
public static void main(String[] args)
{
	int[] arr = { 1,9,8,4,6,4,5 };
	int n = arr.length;
	printOrder(arr, n);

}
}
/* This code is contributed by Mr. Somesh Awasthi */


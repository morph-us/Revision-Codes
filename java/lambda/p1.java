import java.util.ArrayList;
import java.util.function.Consumer;


class Test{
	public static void main(String args[]){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
    		numbers.add(5);
   		numbers.add(9);
   		numbers.add(8);
		numbers.add(1);
		numbers.forEach( (n) -> {
		       	System.out.print("number: "+ n);
	 		System.out.println(" Square: "+ (n*n));	      				
		} );


	}
}

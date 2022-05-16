import java.util.*;


class Test{
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();


		for(int i=0;i<100;i++){
			list.add(i);
		}


		Spliterator<Integer> si = list.spliterator();
		
		//si.forEachRemaining(System.out::println);
		si.tryAdvance(System.out::println);




	}



}

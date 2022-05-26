import java.util.*;

class Test{
	public static void main(String args[]){
		
		int a[] = {1,5,625,3,9,2};
		
		List l = Arrays.asList(a);
		
		// l.stream().forEach((n)->{
		// 	for(int i=0;i<n.length;i++){
		// 		System.out.println(n[i]);
		// 	}
		// });


		//Integer a[] = {1,5,625,3,9};
		

	//	String a[] = {"Hello","this ","is","an","array"};
		

		//List<Integer> l = Arrays.asList(a);
		
		//ArrayList<Integer> l1 = new ArrayList<Integer>(l);

	//	System.out.println(l.get(2));


		l.stream().forEach(System.out::println);


		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}

		Iterator it = l.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}


	}
}

import java.util.*;

class Test{
	public static void main(String args[]){
		int ar[] = {12,23,13,04};
		ArrayList<Integer> l = new ArrayList<Integer>();
		//ArrayList<int> l = new ArrayList<int>();

		//Ways to traverse


		for(int a:ar){
			l.add(a);
		}

//1
		System.out.println(l);

System.out.println("using for");
		for(int a:l){
				System.out.println(a);

		}

		Collections.sort(l);

//2
		System.out.println("using iterator");
		Iterator itr = l.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}

//3
		System.out.println("using stream");
		l.stream().forEach(System.out::println);

	}
}

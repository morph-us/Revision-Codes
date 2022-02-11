import java.util.*;
import java.util.stream.*;




class Test implements Comparable<Test>{
	public static void main(String args[]){
		List<Integer> l = Arrays.asList(33,1,32,99,21);
		Set s = l.stream().map(x->x*x).collect(Collectors.toSet());

		System.out.println(l);
		System.out.println(s);


		List a = l.stream().map(x->x*x).filter(x->x%2==1).collect(Collectors.toList());
		System.out.println(a);

		List b = l.stream().sorted().collect(Collectors.toList());
		
		System.out.println(b);


		ArrayList<Test> al = new ArrayList<Test>();
		al.add(new Test());
		al.add(new Test());
		al.add(new Test());
		al.add(new Test());
		al.add(new Test());



		System.out.println(al);

		ArrayList<Test> k = new ArrayList<Test>(al.stream().sorted().collect(Collectors.toList()));



		System.out.println(k);

	}

	public int compareTo(Test t){
		return this.hashCode()-t.hashCode();

	}


}

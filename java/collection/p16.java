import java.util.*;
import java.util.stream.*;




class Test implements Comparable<Test>{
	public static void main(String args[]){
		ArrayList<Test> al = new ArrayList<Test>();
		al.add(new Test());
		al.add(new Test());
		al.add(new Test());
		al.add(new Test());
		al.add(new Test());



		System.out.println(al);

		ArrayList<Test> k =al.stream().sorted().collect(Collectors.toList());



		System.out.println(k);

	}

	public int compareTo(Test t){
		return this.hashCode()-t.hashCode();

	}


}

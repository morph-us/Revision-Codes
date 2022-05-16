import java.util.*;


class Test{
	public static void main(String args[]){
		ArrayList<String> l = new ArrayList<String>();
		l.add("helo");
		l.add("hi");
		l.add("hey");
		l.add(null);
		l.add(null);
		l.add("hey");

		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		System.out.println(l.get(5));
		System.out.println(l.size());
		System.out.println(l.get(5).hashCode());
	//	System.out.println(l.get(4).hashCode());// null element, care must be taken while accessing null

		System.out.println("ITERATING");

		int i=0;
		for(String s:l){
			System.out.println(i++ + " : "+ s + " : "+s.hashCode());
			System.out.println(s);
		}





	}
}

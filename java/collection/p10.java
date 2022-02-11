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

		System.out.println(l.get(2));
		System.out.println(l.size());
	
		for(String a:l){
			System.out.println(a.hashCode());
		}

		System.out.println(l.hashCode());

	}
}

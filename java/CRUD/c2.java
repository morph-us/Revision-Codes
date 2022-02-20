import java.util.*;
import java.util.stream.*;


class Student implements Comparable<Student>{
	int roll;

	Student(int roll){
		this.roll = roll;
	}

	public String toString(){
		return "r : "+roll;
	}

	public boolean equals(Student o){
		if(o.roll==this.roll)
			return true;
		else
			return false;
	}

	public int compareTo(Student a){
		return a.roll-roll;

	}	



}


class SortByRoll implements Comparator<Student>{

	public int compare(Student a,Student b){
		return a.roll-b.roll;

	}

}

class Test{
	public static void main(String args[]){
		
		int[] a = {19,132,23,4,65};

		ArrayList<Student> l = new ArrayList<Student>();
		Arrays.stream(a).forEach(x->l.add(new Student(x)));


		System.out.println(l);
		//sort
		
		//M1
		//Collections.sort(l,new SortByRoll());
		
		//M2
		l.sort(new SortByRoll());
		
		
		System.out.println(l);
	
		//reverse	
			Collections.reverse(l);
			System.out.println(l);


		l.sort(new SortByRoll());
		System.out.println(l);
		
		//SEARCH list must be sorted in ascending order for binarySearch
		


		Student k = new Student(19);
		l.add(k);
		
		System.out.println(l.contains(new Student(19)));//why is this false
		
		System.out.println(l.contains(k));//but this true




		System.out.println(Collections.binarySearch(l,new Student(19),new SortByRoll()));



		//replace

		l.set(1,new Student(18));
		System.out.println(l);



		//iterator
		
		Iterator it = l.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
		




	}
}

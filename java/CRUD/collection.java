import java.util.*;
import java.util.stream.*;


class Student{
	int roll;

	Student(int roll){
		this.roll = roll;
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

		ArrayList<Integer> l = new ArrayList<Integer>();
		Arrays.stream(a).forEach(l::add);

		//sort
		Collections.sort(l);
		System.out.println(l);


		Collections.reverse(l);
		
		System.out.println(l);


	}
}

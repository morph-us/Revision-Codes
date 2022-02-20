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


//this is overriden
	public boolean equals(Object e){

		Student o = (Student)e;
		
		System.out.println("e called");
		if(o.roll==this.roll)
			return true;
		else
			return false;
	}

	
	//this is not overriden
	public boolean equals(Student e){
	
		
		System.out.println("e called");
		if(o.roll==this.roll)
			return true;
		else
			return false;
	}



/*	public int hashcode(){
		return roll*roll;
	}
*/
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

		Student k = new Student(19);
		l.add(k);
		
		System.out.println(l.contains(new Student(19)));//why is this false
		
		System.out.println(l.contains(k));//but this true



		System.out.println(l.indexOf(new Student(19)));//why is this false
		System.out.println(l.indexOf(k));//why is this false
	}
}

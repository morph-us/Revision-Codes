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


	public int compareTo(Student o){

		return roll-o.roll;
	}

	public boolean equals(Student o){
		if(o.roll==this.roll)
			return true;
		else
			return false;
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



		TreeMap<Student,Integer> map = new TreeMap<Student,Integer>();
		Arrays.stream(a).forEach(x->map.put(new Student(x),x));


		System.out.println(map);


		//SEARCH
		System.out.println(map.containsKey(new Student(19)));
		System.out.println(map.get(new Student(19)));
		System.out.println(map.containsValue(199));
	
		


	}
}

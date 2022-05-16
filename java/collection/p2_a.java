import java.util.*;
class Student implements Comparable<Student>{
	String name;
	int roll;
	
	Student(int roll,String name){
		this.roll = roll;
		this.name = name;

	}
	
	public String toString(){

		return name +" : "+ roll;
	}


	public int compareTo(Student obj){
		return this.name.compareTo(obj.name);
	}




}

class Test{
	public static void main(String args[]){
		ArrayList<Student> l = new ArrayList<Student>();

		l.add(new Student(101,"Ashish"));
		l.add(new Student(126,"manesh"));
	
		l.add(new Student(99,"kuldeep"));
		l.add(new Student(104,"Roman"));
	
		l.add(new Student(193,"suresh"));

		System.out.println(l);
		System.out.println(l.get(2));
		System.out.println(l.size());
		
	//Collections.sort(l,new SortByName());
		Collections.sort(l);
		System.out.println(l);



		l.sort(new SortByRoll());
		System.out.println(l);



	}
}


class SortByName implements Comparator<Student>{
	public int compare(Student a, Student b){
		return a.name.compareTo(b.name);
	}


}


class SortByRoll implements Comparator<Student>{
	public int compare(Student a, Student b){
		return a.roll - b.roll;
	}


}





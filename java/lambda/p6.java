import java.util.*;
class Student implements Comparable<Student>{
	int roll;
	String name;

	Student(int r,String n){
		this.roll = r;
		this.name = n;	

	}

	public int compareTo(Student obj){
		return name.compareTo(obj.name);
	//	return roll-obj.roll;
	}


	public String toString(){
		return name+ ":"+roll;

	}


}




class Test{
	public static void main(String args[]){
		
		TreeMap<Integer,Student> m = new TreeMap<Integer,Student>();

		m.put(100,new Student(1,"Rajesh"));
		m.put(120,new Student(8,"Mohit"));
		m.put(22,new Student(9,"Srivas"));
		m.put(21,new Student(3,"Kamal"));
		m.put(03,new Student(4,"Deepal"));
		m.put(21,new Student(2,"Gopal"));

		System.out.println(m);
		
		ArrayList<Integer> l = new ArrayList<Integer>(m.keySet());
		System.out.println(l); // order is same as order was in map
		

		

		ArrayList<Student> l1 = new ArrayList<Student>(m.values());
		System.out.println(l1);
			

		Collections.sort(l1);
		System.out.println(l1);


		Collections.sort(l1,(Student p1,Student p2)->{
				return p1.roll - p2.roll;	
			
		});


		System.out.println(l1);


	}
}

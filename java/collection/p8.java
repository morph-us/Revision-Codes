import java.util.*;
class Student implements Comparable<Student>{
	int roll;
	String name;

	Student(int r,String n){
		this.roll = r;
		this.name = n;	

	}

	public int compareTo(Student obj){
	//	return name.compareTo(obj.name);
		return roll-obj.roll;
	}


	public String toString(){
		return name+ ":"+roll;

	}


}




class Test{
	public static void main(String args[]){
		
		TreeMap<Integer,Student> m = new TreeMap<Integer,Student>();

		m.put(100,new Student(1,"Rajesh"));
		m.put(21,new Student(3,"kamal"));
		m.put(03,new Student(4,"deepal"));
		m.put(120,new Student(8,"mohit"));
		m.put(22,new Student(9,"srivas"));
		m.put(21,new Student(2,"gopal"));

		System.out.println(m);
	
		System.out.println(m.get(100));

		for(Map.Entry e: m.entrySet()){
			System.out.println(e.getKey()+ " : "+e.getValue());
			
		
		}


		System.out.println("using stream");

		m.entrySet().stream().forEach((entry)->{
			System.out.println(entry.getKey() + " : "+entry.getValue() );
		});





	}
}

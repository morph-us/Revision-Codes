import java.util.*;
class Student {
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
		
		TreeMap<Student,Integer> m = new TreeMap<Student,Integer>();

		m.put(new Student(1,"Rajesh"),100);
		m.put(new Student(3,"kamal"),21);
		m.put(new Student(4,"deepal"),03);
		m.put(new Student(8,"mohit"),120);
		m.put(new Student(9,"srivas"),22);
		m.put(new Student(2,"gopal"),21);

		System.out.println(m);
	
		//System.out.println(m.get());

		for(Map.Entry e: m.entrySet()){
			System.out.println(e.getKey()+ " : "+e.getValue());
		}
		





	}
}

class Student{
	int roll = 10;
	static int year = 2;

	void attendence(){
		System.out.println("in method attende");
	}

	static void syllabus(){
		System.out.println("70% syllabus covered");
	}
	
	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student();


		System.out.println(s1.roll);
		System.out.println(s1.year);
		System.out.println(s2.roll);
		System.out.println(s2.year);

		
		s1.roll++;
		s2.year++;


		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(s1.roll);
		System.out.println(s1.year);
		System.out.println(s2.roll);
		System.out.println(s2.year);

	


	}


}

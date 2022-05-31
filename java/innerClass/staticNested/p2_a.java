class X{
	static int a = 10;
	int b = 20;
	static class Y{

		void fun(){
			System.out.println("fun");
			System.out.println(a);
			System.out.println(b); // only static members of outer class can be accessed from inner class
 
		}

		static void gun(){

		
			System.out.println(a);

		}	
	}

	public static void main(String args[]){

		Y obj = new Y();// no this required , so its object can be created
		obj.fun();



	}



}

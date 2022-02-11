class X{
	static int a = 10;
	int b = 20;
	static class Y{

		static int a = 10;
		int b = 20;
		void fun(){
			System.out.println("fun");
			System.out.println(a);
			//System.out.println(b);

		}

		static void gun(){

		
			System.out.println(b);

		}	
	}

	public static void main(String args[]){

		Y obj = new Y();// no this required , so its object can be created
		obj.fun();



	}



}

class X{
		static class Y{
		static int a = 30;
		int b = 21;
		void fun(){
			System.out.println("fun");
			System.out.println(a);
			System.out.println(b);



		}

		static void gun(){
			System.out.println("gun");
			System.out.println(a);
			System.out.println(b);


		}	
	}
}
class Test{

	public static void main(String args[]){


		new Test().fun();
	
	}

	void fun(){
		X.Y obj = new X.Y();
		obj.fun();

		System.out.println(obj.a);
		System.out.println(obj.b);
	
	}
}

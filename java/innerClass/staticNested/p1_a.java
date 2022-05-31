class X{
		static class Y{
		void fun(){
			System.out.println("fun");

		}	
	}
}
class Test{

	public static void main(String args[]){

		X.Y obj = new X.Y();
		obj.fun();
	}
}

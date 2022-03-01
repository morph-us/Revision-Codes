
class A  {



	 	 void getName1(int x) {
			System.out.println( "hello A");

		}





};

class B extends A{


	 	 void getName1(float x) {
			System.out.println( "hello B");

		}


};

class Test{

	public static void main(String args[]){
			B ptr = new B();
			
			ptr.getName1(10.3f);
			ptr.getName1(11);

		
	}

}

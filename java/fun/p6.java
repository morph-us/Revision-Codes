

class Demo{

	static int a = 10;
	int b = 20;
	static {

			System.out.println("static block 1");

	}


	{

		System.out.println("inst  block 1");
	}





	Demo(){
		System.out.println("Demo const");

	}


	static {

			System.out.println("static block 2");

	}


	{

		System.out.println("inst  block 2");
	}

	static void fun(){
		System.out.println("in fun");

	}


}

class Test{
	public static void main(String args[]){
//		Demo d;
	//	Demo.fun();
	//
		//System.out.println(Demo.a);
	//	System.out.println(Demo.a);



		Demo d = new Demo();
		Demo d1 = new Demo();


		//static elements are initialized inside static block and static block will run only once it can be when a static element is called or a new object of that class are called
		//
		//
		//
		//instance elments are initialzed  inside constructor , instance block runs before the statemnets inside the constuctor .
		//instance block is run everytime an object is created 
	}
}


class Test{
	int a = 10;
	static int b = 20;

	static{
		static int k = 10;
		System.out.println("inside static block1");

	}


	public static void main(String args[]){
	
		static int a = 10;	
		System.out.println("main");



	}

	static{

		System.out.println("inside static block 2");

	}

	public void fun(){

		static int b = 20;
		System.out.println("inside fun");
	}



}

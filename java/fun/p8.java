

class Demo{

	int a = 60;
	int b = 20;
	static {
		int a =10;
			System.out.println("static block 1");

	}


	{
		int a = 10;
		int b = 20;
		System.out.println("inst  block 1 a = "+this.a);
	}





	Demo(){

		int a = 10;
		int b = 20;
		System.out.println("Demo const");

	}


	static {
			int a = 10;
			System.out.println("static block 2");

	}


	{
		int a = 10;
		System.out.println("inst  block 2");
	}

	static void fun(){
		System.out.println("in fun");

	}


}

class Test{
	public static void main(String args[]){
		Demo d = new Demo();
		Demo d1 = new Demo();


}
}

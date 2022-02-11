class Demo{
	static int a =10;
	static int b =20;

	Demo(){
		System.out.println("Demo const");
	}

	static void fun(){
		System.out.println("inside fun");

	}

}


class Test{
	public static void main(String args[]){
		
	System.out.println(Demo.a);
	System.out.println(Demo.b);

	Demo.fun();
	}



}

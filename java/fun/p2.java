class Demo{
	static int a =10;
	int b =20;

	Demo(){
		System.out.println("Demo const");
	}

	static void fun(){
		System.out.println("inside fun");

	}

	static void gun(){
		System.out.println("inside gun");

	}


}


class Test{
	public static void main(String args[]){
	
	Demo d = new Demo();

	System.out.println(d.a);
	System.out.println(d.b);
	d.fun();
	d.gun();



	}



}

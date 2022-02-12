class X{
	static void fun(){
		System.out.println("fun p");

	}

}

class Y extends X{
	static void fun(){
		System.out.println("fun c");

	}

}

class Test{	
	public static void main(String... args){
		X a = new X();
		X b = new Y();
		Y c = new Y();


		a.fun();
		b.fun();
		c.fun();

	}


}


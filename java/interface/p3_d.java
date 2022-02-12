interface X{
	static void fun(){
		System.out.println("fun p");

	}

}

class Y implements X{
/*	static void fun(){
		System.out.println("fun c");

	}
*/

}

class Test{	
	public static void main(String... args){

		X b = new Y();




		b.fun();// error static method of interface can only be called with interface name


	}


}


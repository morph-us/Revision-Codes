interface X{
	static void fun(){
		System.out.println("fun p");

	}

}

class Y implements X{
	static void fun(){
		System.out.println("fun c");

	}

}

class Test{	
	public static void main(String... args){
		X a = null;
		X b = new Y();
		Y c = new Y();


		a.fun();//error , 
		b.fun();// error static method of interface can only be called with interface name
		c.fun();

	}


}


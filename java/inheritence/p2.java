class X{
	static void fun(){
		System.out.println("parent");

	}



}

class Y extends X{
	static void fun(){
		System.out.println("child");

	}

}


class Test{
	public static void main(String args[]){
		X x = null;// = new Y();

		x.fun();

	}
}

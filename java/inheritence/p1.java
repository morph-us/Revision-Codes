class X{
	void fun(){
		System.out.println("parent");

	}



}

class Y extends X{
	void fun(){
		System.out.println("child");

	}

}


class Test{
	public static void main(String args[]){
		X x = new Y();

		x.fun();

	}
}

class X{
	void fun() throws Exception{
		System.out.println("parent");

	}



}

class Y extends X{
	void fun() {
		System.out.println("child");

	}

}


class Test{
	public static void main(String args[]){
		Y y = new Y();

		y.fun();

	}
}

class X{
	void fun(Object e) {
		System.out.println("parent");

	}



}

class Y extends X{
	
	

	void fun(X e) {
		System.out.println("child");

	}

	
	@Override
	void fun(Object e) {
		System.out.println("child object");

	}


}


class Test{
	public static void main(String args[])throws Exception{
		X y = new Y();

		y.fun(new X());

	}
}

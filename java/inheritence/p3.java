class X{
	void fun() throws Exception{
		System.out.println("parent");

	}



}

class Y extends X{
	@Override
	void fun() {
		System.out.println("child");
		//throw new Exception();

	}

}


class Test{
	public static void main(String args[]){
		//X y = new Y();
		Y y = new Y();

		y.fun();

	}
	//it is not required for overriding method to throw exception though it must be handled if parent reference is used 
}

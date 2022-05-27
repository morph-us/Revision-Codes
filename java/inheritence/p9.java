class Parent{


}

class Child extends Parent{

}

class X{
	void fun(Parent e) {
		System.out.println("parent");

	}


	void gun(Parent e) {
		System.out.println("parent");

	}

	



}

class Y extends X{
	
	

	@Override
	void fun(Parent e) {
		System.out.println("child");

	}


	void gun(Child e) {
		System.out.println("child");

	}



	//for overriding the parameters must be same type , parent child relation is not see in overriding  methods

	
	// @Override
	// void fun(Object e) {
	// 	System.out.println("child object");

	// }


}


class Test{
	public static void main(String args[])throws Exception{
		X y = new Y();

		y.fun(new Child());

		y.gun(new Child());


	}
}

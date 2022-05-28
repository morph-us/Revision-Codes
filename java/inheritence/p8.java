class X{
	void fun(Object e) {
		System.out.println("parent");

	}
	
}

class Y extends X{
	
	

	void fun(Y e) {
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
		X obj1 = new Y();
		obj1.fun(new Y());
		obj1.fun(new X());
			////in this case, fun method is not overloaded as overriden method and ovveriding method have different paramters
			// so eachtime parent class method is called



		// Y obj2 = new Y();		
		// obj2.fun(new Y());
		// obj2.fun(new X());
			//in this case too method is not overridden
			//but object can access two different fun methods


	}
}

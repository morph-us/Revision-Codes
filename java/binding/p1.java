class Parent{
	void foo(){

		System.out.println("foo in parent");
	}

	final void boo(){

		System.out.println("boo in parent");

	}
}

class Child extends Parent{
	void foo(){

		System.out.println("child foo");
	}

}

class Test{
	public static void main(String args[]){
		Parent p = new Parent();


		
		p.foo();
		p.boo();



		Child c = new Child();
		c.foo();

		Parent d = new Child();
		d.foo();
		d.boo();


		d.loo();

		//binding refers to providing address of a method which needs to be called on its invocation.
		//if a method is final, static or private then the binding is said to be early/static binding i.e address of method in memory is resolved at compile time and is given to method invocation
		//
		//for other methods the binding is called late/dynamic binding because the method could have been overloaded in child class so its beter to provide the address of method during runtime 
		//if the method is not overridden then the address of parent method is given and if method is overriden then address of child method is given/mapped to child class method
		//
		//
		//question:  how can you surely say that address of private/static/final method is resolved at compile time because in bytecode the invocation looks similar. I mean it could be possible that address of static/private/final method is also mapped during runtime

	}
}

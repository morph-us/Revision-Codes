class Parent{
	int a = 10;
	int b = 20;
	Parent(int a){
		System.out.println("parent");
	}

	void fun(){
		System.out.println("parent method");

	}

}

class Child extends Parent{
	Child(int a){
		super(a);

		System.out.println("child");
		System.out.println(super.a);
		System.out.println(super.b);
		super.fun();
	}



	void fun(){
		System.out.println("child method");

	}


}


class Test{
	public static void main(String args[]){

		Child c = new Child(10);



	}
}

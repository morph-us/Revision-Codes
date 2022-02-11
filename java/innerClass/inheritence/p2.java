class Parent{
	Parent(int a){
		System.out.println("parent");
	}
}

class Child extends Parent{
	Child(int a){

		System.out.println("child");

	}
}

class Test{
	public static void main(String args[]){

		Child c = new Child(10);



	}
}

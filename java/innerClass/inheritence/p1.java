class Parent{
	Parent(){
		System.out.println("parent");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("child");
	}
}

class Test{
	public static void main(String args[]){
		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();


	}
}

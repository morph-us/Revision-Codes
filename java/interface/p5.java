interface A{
	
	default void fun(){
		System.out.println("A fun");

	}

	private void gun();
}

interface B{
	
	default void fun(){
		System.out.println("B fun");

	}


}

class C implements A,B{
	public void fun(){
		System.out.println("c fun");

	}

}


class Test{
	public static void main(String args[]){
		C c = new C();
		c.fun();

	}
}

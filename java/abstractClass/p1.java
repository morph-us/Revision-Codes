abstract class X{
	X(){
		System.out.println("no para cons");
	}

	X(int x){
		System.out.println("1 para cons");
	}
	
	void fun(){

		System.out.println("fun");

	}

	abstract void gun();
}

class Test{
	public static void main(String args[]){
		X x = new X();
		x.fun();

	

	}
}

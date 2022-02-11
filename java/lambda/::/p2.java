import java.util.function.*;

interface  Demo{
	
	abstract  void fun();	
}


class Demo1{
		Demo1(){
			System.out.println("Demo 1 cons");

		}	
	
		
	void gun(){
		System.out.println("inside gun");

	}


	 static void fun(){

		System.out.println("static fun");
	}

}

class Test{
	public static void main(String args[]){


		Demo f = Demo1::fun;

		Test d = new Test();

		d.gun();
	}

	void gun(){

	//	Demo d = Demo :: fun;

		Demo f = new Demo1()::gun;
//		new Demo1()::gun; //do not work
		//new Test() ;//work
		//
		Demo1 ::new;

	}
}

class Demo{
	Demo(){
		System.out.println("constructor");
	}
	
	void fun(){

		System.out.println("inside fun");

	}
	
}



class Test{
	public static void main(String args[]){
//		Demo d = new Demo();

		Demo d = Demo::new;
	//	d::fun();


	}
}

class X{
	void fun() {
		System.out.println("parent");


	}



}

class Y extends X{
	void fun()throws Exception {
		System.out.println("child");
		
	}// if method in parent class does not declare "throws exception" then , method in child class cannot declare "throws exception"

	//if parent class declare "throws Exception" then child class may or may not "throws Exception"	

}


class Test{
	public static void main(String args[]){
		Y y = new Y();

		y.fun();

	}
}

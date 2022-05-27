class X{
	void fun() throws Exception{
		System.out.println("parent");


	}



}

class Y extends X{
	void fun() {
		System.out.println("child");

		throw new Exception(); 
		//if throw keyword is used , exception must be caught or declared to be thrown 
	}

}


class Test{
	public static void main(String args[]){
		Y y = new Y();

		y.fun();

	}
}

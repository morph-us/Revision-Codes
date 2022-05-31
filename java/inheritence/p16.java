class X{
    static int a = 10;
	static void fun(){
		System.out.println("parent");

	}

}

class Y extends X{
    static int a = 10;
    static void fun(){
		System.out.println("child");

	}

}

class Test{
	public static void main(String args[]){
		X x = new Y();
		x.fun();
    
    	Y y = new Y();
		y.fun();



	}
}

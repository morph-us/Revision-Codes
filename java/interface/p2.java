interface X{
	void fun();
	
	static void gun(){
		System.out.println("gun p ");

	};

	default void bun(){
		System.out.println("bun p");

	};


}


class Y implements X{
	
	public void fun(){
		System.out.println("fun child");
		
	}

	void gun(){
		System.out.println("gun child");

	}


	public void bun(){
		System.out.println("bun child");

	};

}


class Test{
	public static void main(String args[]){
		X obj = new Y();

		obj.fun();




	}
}

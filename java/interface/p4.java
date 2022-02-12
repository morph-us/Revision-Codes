interface X{
	void fun();
	
	default void bun(){
		System.out.println("bun p");

	};


}


class Y implements X{
	
	public void fun(){
		System.out.println("fun child");
		
	}

	static void gun(){
		System.out.println("gun child");

	}


	public void bun(){
		System.out.println("bun child");

	};

}


class Test{
	public static void main(String args[]){
		Y obj = new Y();

		obj.fun();
		obj.gun();

		obj.bun();




	}
}

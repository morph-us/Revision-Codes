class X{
	private char fun(){
		System.out.println("parent fun");
		return 'x';
	}

}

class Y extends X{
	 int fun(){
	
		System.out.println("child fun");
		return 65;
	}
	
}

class Test{
	public static void main(String args[]){
		Y obj = new Y();


		X l = new Y();
	
		X k = new X();
		obj.fun();
		l.fun();
		k.fun();


	}
}



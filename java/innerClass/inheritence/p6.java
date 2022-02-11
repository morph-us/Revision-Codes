class Methods{
	void method(char c){
		System.out.println("in char");

	}

	void method(int a){
		System.out.println("in int");
	}

	void method(String s){
		System.out.println("in string");

	}

}

class Demo{
	public static void main(String args[]){
		Methods obj = new Methods();
		obj.method(10.5);

	}


}

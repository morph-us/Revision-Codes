class Methods{
	void method(int a,float b){
		System.out.println("1");

	}

	void method(float a, int b){
		System.out.println("2");
	}

	void method(int a, int b){
		System.out.println("3");

	}


	void method(float a, float b){
		System.out.println("4");

	}

}

class Demo{
	public static void main(String args[]){
		Methods obj = new Methods();
		obj.method(10,10.5f);
		obj.method(10.5f,10);
		obj.method(10.5,10.5);
		obj.method(10,10);
	}


}

class Methods{
	void method(double c){
		System.out.println("in char");

	}

	

}

class Demo{
	public static void main(String args[]){
		Methods obj = new Methods();
		obj.method(10);
		obj.method(10.5f);
		obj.method(10.5);
		obj.method('c');
		obj.method(10l);
	}


}

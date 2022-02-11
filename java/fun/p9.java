class Test{
	static{
		
		System.out.println("Hello from static block");
		Demo d = new Demo();
		System.out.println(d.a);

	}
	
	public static void main(String args[]){
	
	}
	

}

class Demo{
	int a =10;


}

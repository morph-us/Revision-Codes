interface Functional{
	abstract void method(String args);


}


class Test{
	public static void main(String args[]){
		
		Functional obj = (str)->{
			
			System.out.println(str);
		};


		obj.method("hello");



	}



}

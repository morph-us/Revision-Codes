class Sample{
	private double num1;

	Sample(){
//		fun();
		this(44.1);
	}


	Sample(double num){

		this();
	}


	void fun(){

		System.out.println("fun");


	}

}


class Test{
	public static void main(String args[]){
		Sample s = new Sample();
		




	}



}

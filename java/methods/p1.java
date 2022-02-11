class Sample{
	private double num1,num2;

	Sample(double num1,double num2){
		num1 = num1;
		num2 = num2;

		System.out.println(this);
	}


	double sum(){
		return num1+num2;


	}

}


class Test{
	public static void main(String args[]){
		Sample s = new Sample(10.5,9.2);
		
		System.out.println(s.sum());



	}



}

class Sample{
	private double num1,num2;

	Sample(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
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

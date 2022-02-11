
interface MathsFunction{
	int run(int num);
}




class Test{



	public static void main(String args[]){
	MathsFunction square = (n) -> n*n;
	MathsFunction cube = (n)-> n*n*n;

	printResult(10,square);
	printResult(10,cube);

	}


	public static void printResult(int n,MathsFunction fun){
		System.out.println(fun.run(n));


	}
}

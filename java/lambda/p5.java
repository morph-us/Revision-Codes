
interface MathsFunction{
	int run(int num);
}




class Test{



	public static void main(String args[]){
	MathsFunction square = (n) -> n*n;
	MathsFunction cube = (n)-> n*n*n;

	System.out.println(square.run(10));
	System.out.println(cube.run(10));


	MathsFunction m = (int n)->{
			System.out.println("This is inside multi line function");
			return n*n*n*n;
	};


	System.out.println(m.run(10));


	}


}

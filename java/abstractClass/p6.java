interface  X{
		abstract int fun(int a);

}

class Test{
	public static void main(String args[]){
		X method = (x)->x*x;

		System.out.println(method.fun(5));

	}
}

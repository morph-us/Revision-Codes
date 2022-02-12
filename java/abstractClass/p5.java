abstract class X{
		abstract int fun(int a);

}

class Test{
	public static void main(String args[]){
		X method = (x)->x*x;

		method.fun(5);

	}
}

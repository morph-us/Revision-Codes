interface Demo{
	public abstract void fun(int a);
	public abstract void gun(int b);


}

class Test{
	public static void main(String args[]){

		Demo r1 = (n)->{
			System.out.println("Ans " + n);
		};

		r1.fun();
	}



}

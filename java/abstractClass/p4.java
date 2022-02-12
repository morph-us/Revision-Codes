interface A{
	int gun();

}


abstract class X implements A{
	public abstract int gun();

}


class Z extends X{
	int gun(){
		System.out.println("gun overriden by z");

	}

}


abstract class Test{
	public static void main(String args[]){
		Z obj = new Z();
		obj.gun();

	}

}



class X{
	final	double fun(){

		return 10.4;
	}

}

class Y extends X{

	double gun(){

		return 1;
	}

}

class Test{
	public static void main(String args[]){
		Y obj = new Y();

		X l = new Y();
		System.out.println(obj.fun());
		System.out.println(l.fun());


	}



}

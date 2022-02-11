

class Demo{

	static {

			System.out.println("static block 1");

	}


	{

		System.out.println("inst  block 1");
	}





	Demo(){
		System.out.println("Demo const");

	}


	static {

			System.out.println("static block 2");

	}


	{

		System.out.println("inst  block 2");
	}

	public static void main(String args[]){
		
		//Demo d;


		//inside jvm , Classname.main() is called , so all the static elments of the class are initialized when we run the class

	}

}


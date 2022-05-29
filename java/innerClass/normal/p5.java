class Water{
	static{
	//	Fish f = new Fish();
	//	f.catchFish();

		System.out.println("static block");
		//System.out.println(this);

	}

	{

		Fish f = new Fish();
		f.catchFish();

		System.out.println("instance block");
		
		
	}



	class Fish{
		void catchFish(){
			System.out.println("catch fish");

		}	


	}

	public static void main(String args[]){
			//Fish f = new Fish();
		//	f.catchFish();

//			System.out.println(this);
//			Water w = new Water();

			new Water();



	}	



}

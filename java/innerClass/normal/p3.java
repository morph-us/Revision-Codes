class Water{
	static int b  = 20;
	class Fish{
		int a =10;
		static int b = 20;


		int fun(){
			System.out.println("fun");
			System.out.println(b);
			return 0;
		}



/*
		static int gun(){
			System.out.println("gun");
		}

*/
			//non constant static declaration not allowed in inner class
	}
}

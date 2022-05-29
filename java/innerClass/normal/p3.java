class Water{
	static int b  = 20;
	class Fish{
		int a =10;
		final static int b = 21;


		 int fun(){
			System.out.println("fun");
			System.out.println(b);
			System.out.println(Water.this.b);
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


class Test{
	public static void main(String args[]){
		Water.Fish f = new Water().new Fish();
		f.fun();


	}
}

class Water{
	 int b  = 30;
	class Fish{

		 final int b = 20;


		void fun(){
			int b = 31;
			System.out.println("fun");
			System.out.println(b);
			System.out.println(this.b);
			System.out.println(Water.this.b);

		}

	}


	public static void main(String args[]){
			Fish f = new Water().new Fish();

			f.fun();

	}
}

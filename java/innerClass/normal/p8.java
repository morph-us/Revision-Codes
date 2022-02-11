class Water{
	int b  = 30;
	class Fish{

		 int b = 20;


		class Food{
			int b = 10;

		void fun(){
			System.out.println("fun");
			System.out.println(b);
			System.out.println(this.b);
			System.out.println(Fish.this.b);
			System.out.println(Water.this.b);

		}





		}


	}


	public static void main(String args[]){
			Fish.Food f = new Water().new Fish().new Food();

			f.fun();

	}
}

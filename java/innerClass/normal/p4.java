class Water{
	
	class Fish{
		void catchFish(){
			System.out.println("catch fish");

		}	


	}

	public static void main(String args[]){
			Fish f = new Fish();  // two hidden parameter, f, this
			f.catchFish();


			// Fish f = new Water().new Fish();
			// f.catchFish();



	}	



}

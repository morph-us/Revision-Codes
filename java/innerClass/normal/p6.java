class Water{
	
	class Fish{
		void catchFish(){
			System.out.println("catch fish");

		}	


	}

	public static void main(String args[]){
			//Fish f = new Fish();  gives error,  two hidden parameter, (f, this) this cannot be accessed from a static context
		//	f.catchFish();

	}	


	void fun(){
		Fish f = new Fish();//this works, (f,this) are passed 


	}
}

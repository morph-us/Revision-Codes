
class Demo{
	public static void main(String args[]){
	 new Thread(){
		public	void run(){
			for(int i=0;i<10;i++){
				System.out.println(this.currentThread());	
			}

		}
	}.start();

	//t.start();

	for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread());	
			}

		

	}
}

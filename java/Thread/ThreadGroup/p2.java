class ThreadDemo extends Thread{
	 Thread threadObj = null;
	
	ThreadDemo(Thread threadObj){
		this.threadObj = threadObj;
	}


	public void run(){
		try{
		threadObj.join();
		}
		catch(Exception e){

		}
		System.out.println("in run : "+Thread.currentThread().getName());
		
	}

}

class Test{
	public static void main(String args[]){
		ThreadDemo t1 = new ThreadDemo(Thread.currentThread());
		ThreadDemo t2 = new ThreadDemo(Thread.currentThread());


		System.out.println(t1.getThreadGroup());	
		System.out.println(t2.getThreadGroup());	

		t1.start();
		t2.start();

		

		System.out.println("main : "+Thread.currentThread().getName());

	}
}

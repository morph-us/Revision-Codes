class ThreadDemo extends Thread{
	public void run(){

		System.out.println("in run");

	}

}

class Test{
	public static void main(String args[]){
		ThreadDemo t1 = new ThreadDemo();
	       	Thread t2 = new Thread(t1);

		System.out.println(t1.getThreadGroup());	
		System.out.println(t2.getThreadGroup());	

		t1.start();
		t2.start();




	}
}

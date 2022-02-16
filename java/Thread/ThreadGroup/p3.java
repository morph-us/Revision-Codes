class ThreadDemo extends Thread{
	public void run(){
		//System.out.println("in run : "+Thread.currentThread().getName()+ " " +Thread.currentThread().getThreadGroup());
		for(int i=0;i<100000;i++);
		}
}

class Test{
	public static void main(String args[]){

		ThreadDemo obj = new ThreadDemo();

		ThreadGroup tgrp = new ThreadGroup("My thread Group");
	

		Thread t1 = new Thread(tgrp,obj,"one");
		Thread t2 = new Thread(tgrp,obj,"two");
		Thread t3 = new Thread(tgrp,obj,"three");
	
		tgrp.list();// it prints only the thread currently running
		t1.start();
		t2.start();
		t3.start();

		System.out.println("main : "+Thread.currentThread().getName());
		System.out.println("main : "+Thread.currentThread().getThreadGroup());
		tgrp.list();// it prints only the thread currently running

	}
}

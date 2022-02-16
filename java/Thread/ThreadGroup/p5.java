class ThreadDemo extends Thread{
	public void run(){
		//System.out.println("in run : "+Thread.currentThread().getName()+ " " +Thread.currentThread().getThreadGroup());
		for(int i=0;i<100000;i++);
		}

}

class Task2 extends Thread{
	Task2(ThreadGroup obj,String s){
		super(obj,s);

	}
	public void run(){
		//System.out.println("in run : "+Thread.currentThread().getName()+ " " +Thread.currentThread().getThreadGroup());

		}




}


class Test{
	public static void main(String args[]){

		ThreadDemo obj = new ThreadDemo();

		ThreadGroup tgrp = new ThreadGroup("My thread Group");
	

		Thread t1 = new Thread(tgrp,obj,"one");
		Thread t2 = new Thread(tgrp,obj,"two");
		Thread t3 = new Thread(tgrp,obj,"three");
	

		t1.start();
		t2.start();
		t3.start();


		ThreadGroup tgrp1 = new ThreadGroup(tgrp,"sub thread group1");


		tgrp1.setDaemon(true);
		tgrp1.setMaxPriority(2);

		Task2 t4 = new Task2(tgrp1,"four");
		Task2 t5 = new Task2(tgrp1,"five");
		Task2 t6 = new Task2(tgrp1,"six");


		ThreadGroup tgrp2 = new ThreadGroup(tgrp1,"sub thread group2");

		Task2 t7 = new Task2(tgrp2,"seven");
		Task2 t8 = new Task2(tgrp2,"eight");
		Task2 t9 = new Task2(tgrp2,"nine");


		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();


		Thread[] ar = {t1,t2,t3,t4,t5,t6,t7,t8,t9};
	
		System.out.println(tgrp1.isDaemon());	
		System.out.println(tgrp2.isDaemon());	
		for(int i=0;i<9;i++){
			System.out.println(i+1 +" : "+ ar[i].isDaemon());

		}

	
		tgrp1.setDaemon(true);

		//setting a threadgroup as daemon does not make all threads in group as daemon
		System.out.println(tgrp1.isDaemon());	
		System.out.println(tgrp2.isDaemon());	
		for(int i=0;i<9;i++){
			System.out.println(i+1 +" : "+ ar[i].isDaemon());

		}





	}
}

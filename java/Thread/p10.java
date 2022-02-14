import java.io.*;


class MyThread extends Thread implements Runnable{
	MyThread(String args){
			super(args);

	}

	public void run(){

/*		for(int i=0;i<100000000;i++){
			System.out.println(Thread.currentThread().getName());

		}
*/

		System.out.println("Name " +Thread.currentThread().getName() + " , priority : "+Thread.currentThread().getPriority());
		


	}
}


class Test{
	public static void main(String args[]){
		MyThread t = new MyThread("1");
		Thread.currentThread().setPriority(8);
		t.setPriority(2);
		t.start();


		
		System.out.println("Name " +Thread.currentThread().getName() + " , priority : "+Thread.currentThread().getPriority());

		Thread m = new MyThread("2");
		m.start();

			for(int i=0;i<1000;i++){
			System.out.println(Thread.currentThread().getName());

		}

		m.setPriority(9);//you can change priority of a thread while it is running too

	}
}

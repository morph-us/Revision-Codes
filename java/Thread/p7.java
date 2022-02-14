import java.io.*;


class MyThread extends Thread{

	public void run(){
		super.start(); //CALLING STart again on a running thread, illegal state exception
		for(int i=0;i<10;i++){
			System.out.println(1);

		}
	
	}


	public void start(){
		super.start();
		System.out.println("hello");
	}



}


class Test{
	public static void main(String args[]){
		MyThread t = new MyThread();
		t.start();


		for(int i=0;i<10;i++){
			System.out.println(2);

		}



	}
}

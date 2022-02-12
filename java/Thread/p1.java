import java.util.*;

class MyThread implements Runnable{
	public void run(){
		System.out.println("inside thread"+ Thread.currentThread());

	}

}


class CustomThread extends Thread{
	CustomThread(String name){

		super(name);
	}
	
	public void run(){

		System.out.println("inside thread"+ Thread.currentThread());
	}

}

class Test{
	public static void main(String... args){
		Thread obj = new Thread(new MyThread());
		obj.start();


		Thread t = new CustomThread("Custom Thread name");
		t.start();

}
}

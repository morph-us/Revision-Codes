import java.io.*;


class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(1);

		}


	
	}
}


class Test{
	public static void main(String args[])throws Exception{
		MyThread t = new MyThread();
		t.start();


		for(int i=0;i<100;i++){
			System.out.println(2);
			if(i==1)
				Thread.sleep(1000); //current thread goes to sleep and other thread can get priority

		}



	}
}

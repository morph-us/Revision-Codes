import java.io.*;


class MyThread extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon");
			for(int i=0;i<Integer.MAX_VALUE;i++){
			System.out.println("Daemon");
				

			}
		
		}	
		else{
			System.out.println("user ");
			/*for(int i=0;i<Integer.MAX_VALUE;i++){
			System.out.println("USER");
				

			}*/
	
	
		}

	}
}


class Test{
	public static void main(String args[]){
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();




	}
}

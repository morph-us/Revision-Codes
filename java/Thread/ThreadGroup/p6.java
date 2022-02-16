import java.io.*;

class Shop implements Runnable{
	String name = null;
	public void run(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			name = br.readLine();
		}
		catch(Exception e){
				e.toString();
		}

		System.out.println(Thread.currentThread().getName() + " shop name : "+name);

	}


}

class Test{
	public static void main(String args[])throws Exception{
			ThreadGroup tgrp1 = new ThreadGroup("clothes shop");


			Thread t1 = new Thread(tgrp1,new Shop(),"Peter England");
			Thread t2 = new Thread(tgrp1,new Shop(),"levis");


			Shop tm = new Shop(){
				public void run(){
					System.out.println("Shop for sale");
				}

			};
			Thread t3 = new Thread(tm,"for sale");
				

			System.out.println("Mall opens");
			t1.join();
			t2.join();
			t3.join();


	
	
			t1.start();
			t2.start();
			t3.start();

				System.out.println("Mall closes");






	}




}

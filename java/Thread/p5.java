import java.io.*;
import java.util.*;

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(1);

		}


		try{
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();	
			System.out.println(str);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}



	
	}
}


class Test{
	public static void main(String args[]){
		MyThread t = new MyThread();
		t.start();


		for(int i=0;i<10;i++){
			System.out.println(2);

		}


		try{
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();	
			System.out.println(str);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

/// EACH THREAD gets some time to execute and use input and output screen
//but when for loop is used, the thread with output loop does not stop until the loop ends

	}
}

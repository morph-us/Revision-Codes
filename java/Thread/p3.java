import java.io.*;


class MyThread extends Thread{
	public void run(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try{
			String str = br.readLine();
			System.out.println(str);
		}
		catch(Exception e){
				System.out.println("");

		}

	}

}



class Test{
	public static void main(String args[]){
		MyThread t = new MyThread();
		t.start();


		for(int i=0;i<100000000;i++){
			System.out.println(i+ " "+Thread.currentThread().getName());

		}



	}
}

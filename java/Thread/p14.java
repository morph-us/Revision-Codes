import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ThreadProcess implements Runnable{
	private String message;

	public ThreadProcess(String tname){
		this.message = tname;
		
	}


	public void run(){
		System.out.println(Thread.currentThread().getName()+" start message " + message);
		task();
		System.out.println(Thread.currentThread().getName()+ "End");

	}

	private void task(){
		try{

			Thread.sleep(3000);
		}
		catch(Exception e){
			System.out.println("exception");
		}
		
	}


	public static void main(String args[]){
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0;i<10;i++){
			ThreadProcess task = new ThreadProcess(" "+i);
			executor.execute(task);
		}

		executor.shutdown();
		while(!executor.isTerminated()){
		
			
		}

		System.out.println("finished all threads");
	}
}


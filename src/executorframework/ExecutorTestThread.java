package executorframework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTestThread {

	public static void main(String[] args) {
		
		
		
		Map<Integer,String> hm= new HashMap<Integer,String>();
		Map<Integer,String> tm= new TreeMap<Integer,String>();
	
		HashMap<Integer,String> hm1= new HashMap<Integer,String>();
		
		ExecutorService es=  Executors.newFixedThreadPool(4);
		
		for (int i = 0; i < 20; i++) {
    
		es.execute(new Runnable(){

			@Override
			public void run() {
				 long sum = 0;
				 long countUntil=10;
	                for (long i = 1; i < countUntil; i++) {
	                        sum += i;
	                }
	                System.out.println(sum);				
			}});
	}
		//es.shutdown();
		
	Future<Long> future=es.submit(new Callable<Long>(){

		@Override
		public Long call() throws Exception {
			long sum = 0;
            for (long i = 0; i <= 100; i++) {
                    sum += i;
            }
            return sum;
		}});
	
	try {
		System.out.println("Callable return--->"+future.get().toString());
	} catch (InterruptedException | ExecutionException e) {
		e.printStackTrace();
	}
	
	}
	
}

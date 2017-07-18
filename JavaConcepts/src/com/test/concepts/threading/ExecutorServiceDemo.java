package com.test.concepts.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		// Runnable Example
		service.execute(new Runnable() {
			
			@Override
			public void run() {

				System.out.println(" i am in run method !!!!");
			}
		});
		
		// Callable Example
		
		Future<String> caller = service.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "Hey thats me !!!!";
			}
		});
		
		try {
			String value = caller.get();
			System.out.println(" caller value " + value);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
					
		service.shutdown();

	}
}

package com.bean;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorNewCachedThreadPool {
	/*
	 * Java Thread Pools
	 * 1.FixedThreadPool   Executor.newFixedThreadPool(int nThreads);
	 * 2.CacheThreadPool   Executor.newCachedThreadPool();
	 * 3.ScheduledThreadPool
	 * 4.SingleThreadedExecutor
	 */
	public static void main(String[] args) {
	
	ExecutorService service=Executors.newCachedThreadPool();
	
	for(int i=0;i<100;i++) {
		service.execute(new Task());
	}
		
	}

	static class Task implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

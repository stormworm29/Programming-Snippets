package forkjoin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolDemo {
	public static void main(String[] args) {
		ExecutorService e=Executors.newFixedThreadPool(1);
		e.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("child Thread");
			}
		});
		e.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("another child Thread");
			}
		});
		System.out.println("main thread");
		e.shutdown();
	}
}

package forkjoin;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableDemo {
	public static void main(String[] args) throws Exception {
		ExecutorService e=Executors.newFixedThreadPool(1);
		Future<String> f=e.submit(new MyCallable());
		String s = f.get();
		System.out.println(s);
	}
}
class MyCallable implements Callable<String> {
	@Override
	public String call() throws Exception {
		return "Message from Child Thread";
	}
}

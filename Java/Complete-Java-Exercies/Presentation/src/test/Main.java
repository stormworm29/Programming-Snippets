package test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
//		Fibonacci f = new Fibonacci(20000);
//		System.out.println(ForkJoinAdd2.startForkJoinSum(10_00_00_000));
//		ForkJoinFibonacci task = new ForkJoinFibonacci(15);
//        new ForkJoinPool().invoke(task);
//        System.out.println(task.getNumber());
//		System.out.println(f.compute());
		int arr[] = {12, 11, 13, 5, 6, 7, 12, 11, 13, 5, 6, 7, 12, 11, 13, 5, 6, 7, 12, 11, 13, 5, 6, 7}; 
//		Merge m = new Merge(arr,0,arr.length);
		MergeSort m = new MergeSort(arr,0,arr.length);
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) );
	}
}
class Fibonacci extends RecursiveTask<Integer> {
	   final int n;
	   Fibonacci(int n) { this.n = n; }
	   public Integer compute() {
	     if (n <= 1)
	       return n;
	     Fibonacci f1 = new Fibonacci(n - 1);
	     f1.fork();
	     Fibonacci f2 = new Fibonacci(n - 2);
	     return f2.compute() + f1.join();
	   }
	 }

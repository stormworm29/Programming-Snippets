package Join;

public class JoinDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyTask());
		t1.setDaemon(true);
		t1.start();
		Thread t2 = new Thread( new MyTask2());
		t2.start();
//		try {Thread.sleep(7000);} catch(Exception e) {}
		System.out.println("main thread has completed the task ...");
	}
}
class MyTask implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("Child Thread1 Called ....");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
class MyTask2 implements Runnable {
	@Override
	public void run() {
		System.out.println("task2 child called ...");
		try {Thread.sleep(5000);} catch(Exception e) {}
		System.out.println("task2 completed ....");
	}
}
package threading;

public class ThreadDemo {
	Thread t;
	public ThreadDemo() {
		t = new Thread(new Task());
		t.start();
	}
	public static void main(String[] args) throws Exception {
		new ThreadDemo();
		Thread t = Thread.currentThread();
		for(int i=0;i<5;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("child thread called...");
		
	}
}
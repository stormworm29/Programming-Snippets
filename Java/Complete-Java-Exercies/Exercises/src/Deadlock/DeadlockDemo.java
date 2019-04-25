package Deadlock;

public class DeadlockDemo {
	public static void main(String[] args) {
		Crane crane = new Crane();
		Frog frog = new Frog();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				frog.catchNeck(crane);
			}
		}).start();
		crane.eatFrog(frog);
	}
}

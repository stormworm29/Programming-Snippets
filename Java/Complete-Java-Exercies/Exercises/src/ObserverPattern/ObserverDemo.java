package ObserverPattern;

public class ObserverDemo {
	public static void main(String[] args) {
		FireAlarm alarm = new FireAlarm();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Teacher shoib = new Teacher();
				alarm.addObserver(shoib);
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Students stud = new Students();
				alarm.addObserver(stud);
			}
		}).start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		alarm.setFire();
	}
}

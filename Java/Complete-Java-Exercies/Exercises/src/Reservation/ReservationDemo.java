package Reservation;

public class ReservationDemo {
	public static void main(String[] args) {
		ReservationCounter counter = new ReservationCounter();
		Thread ramu = new Thread(new Task(counter,1000), "ramu");
		Thread somu = new Thread(new Task(counter,500), "somu");
		ramu.start();
		somu.start();
		
	}
}
class Task implements Runnable {
	ReservationCounter counter;
	int amt;
	public Task(ReservationCounter counter,int amount) {
		this.counter = counter;
		this.amt = amount;
	}
	@Override
	public void run() {
		//synchronized(counter) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			if(name.equals("ramu")) {
			counter.bookTicket(amt);
			counter.giveChange();}
			else {
				counter.drinkWater();
			}
		//}
	}
}
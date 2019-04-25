package Reservation;

public class ReservationCounter {
	int amt;
	synchronized public void bookTicket(int amt) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Ticket booked by .. " + name);
		System.out.println(name + " : for amt... " + amt);
		this.amt = amt;
	}
	synchronized public void giveChange() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("Change given to ... " + name);
		System.out.println(name + " : Amount given back .... : " + (amt-100));
	}
	public void drinkWater() {
		System.out.println("Drinking Water ...");
	}
}

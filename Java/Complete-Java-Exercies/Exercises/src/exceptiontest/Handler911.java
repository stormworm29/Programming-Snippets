package exceptiontest;

public class Handler911 {
	public void handle(DogBiteException dbe) {
		System.out.println("take the viction to hospital ..... ");
	}
	public void handle(DogBarkException dbee) {
		System.out.println("Don't worry, drop the stick, it will not bite .. ");
	}
}

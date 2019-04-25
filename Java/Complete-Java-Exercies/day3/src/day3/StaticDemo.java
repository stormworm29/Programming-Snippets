package day3;

public class StaticDemo {
	public static void main(String[] args) {
		TrainingRoom tr = new TrainingRoom();
		TrainingRoom tr1 = new TrainingRoom();
		tr.training();
		tr.training();
		tr.training();
	}
}
class TrainingRoom {
	Projector pr = new Projector();
	static Speaker sp = new Speaker();
	public void training() {
		Marker mark = new Marker();
	}
}
class Projector {
	public Projector() {
		System.out.println("Projector is Started ...");
	}
}
class Speaker {
	static {
		System.out.println("Speakers are Initiated ...");
	}
}
class Marker {
	public Marker() {
		System.out.println("Marker is Initiated ...");
	}
}
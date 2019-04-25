package Deadlock;

public class FightBack {

}
class Crane {
	synchronized public void leaveMe() {
		System.out.println("Frog Saved");
	}
	synchronized public void eatFrog(Frog frog) {
		System.out.println("Crane caught the frog ...");
		frog.leaveMe();
	}
}
class Frog {
	synchronized public void leaveMe() {
		System.out.println("Frog Dead");
	}
	synchronized public void catchNeck(Crane crane) {
		System.out.println("Crane 's neck is caught by the frog");
		crane.leaveMe();
	}
}

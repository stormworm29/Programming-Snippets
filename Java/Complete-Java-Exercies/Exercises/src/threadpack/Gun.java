package threadpack;

public class Gun {
	boolean flag;
	synchronized public void fillGun() {
		if(flag) {
			try { wait(); } catch(Exception e) { }
		}
		System.out.println("fill the gun ....");
		flag =true;
		notify();
	}
	synchronized public void shootGun() {
		if(!flag) {
			try { wait(); } catch(Exception e) { }
		}
		System.out.println("shoot the gun ....");
		flag = false;
		notify();
	}
}

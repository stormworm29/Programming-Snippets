package threadpack;

public class GunDemo {
	public static void main(String[] args) {
		Gun gun = new Gun();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					gun.shootGun();
				}
			}
		}).start();
		new Thread(new Runnable() {
					
					@Override
					public void run() {
						for(int i=0;i<5;i++) {
							gun.fillGun();
						}
					}
				}).start();
//		for(int i=0;i<5;i++) {
//			gun.fillGun();
//		}
	}
}

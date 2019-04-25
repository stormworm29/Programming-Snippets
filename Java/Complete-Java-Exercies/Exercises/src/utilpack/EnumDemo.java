package utilpack;

public class EnumDemo {

	public static void main(String[] args) {
		TrafficSignals[] signal  = TrafficSignals.values();
		System.out.println(TrafficSignals.valueOf("RED"));
		for(TrafficSignals i : signal) {
			System.out.println(i.name() + " : " + i.getSignal() );
		}
	}
}
enum TrafficSignals {
	
	RED("stop"),ORANGE("Get Ready"),GREEN("go");
	
	String action;
	private TrafficSignals(String action) {
		this.action = action;
	}
	public String getSignal() {
		return action;
	}
}
enum ColorEnum {
	RED,GREEN,BLUE
}
//class EnumSwitchDemo {
//	ColorEnum color = ColorEnum.BLUE;
//	switch(color) {
//	case BLUE: System.out.println("blue color ...");
//				break;
//	
//	}
//}
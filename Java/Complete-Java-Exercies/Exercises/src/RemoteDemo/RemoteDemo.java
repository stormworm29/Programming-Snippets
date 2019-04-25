package RemoteDemo;

public class RemoteDemo {
	Remote remote;
	public RemoteDemo() {
		remote = new Remote();
		Tv tv = new Tv();
		SetTopBox settopbox = new SetTopBox();
		VGame vgame = new VGame();
		SoundBox soundbox = new SoundBox();
		remote.setCommand(new FatherNewsTvCommand(tv,settopbox,vgame,soundbox),1);
		remote.setCommand(new MotherSerialCommand(tv,settopbox,vgame,soundbox),2);
	}
	public static void main(String[] args) {
		RemoteDemo obj = new RemoteDemo();
		obj.remote.executeCommand(1);
	}
}
class Remote {
	Command command[] = new Command[5];
	public Remote() {
		for (int i=0;i<command.length;i++) {
			command[i] = new DummyCommand(null,null,null,null);
		}
	}
	public void setCommand(Command mycommand, int slot) {
		command[slot] = mycommand;
	}
	public void executeCommand(int slot) {
		command[slot].execute();
	}
}
abstract class Command {
	Tv tv;
	SetTopBox settopbox;
	VGame vgame; 
	SoundBox soundbox;
	public Command(Tv tv,SetTopBox settopbox,VGame vgame,SoundBox soundbox) {
		this.tv = tv;
		this.settopbox = settopbox;
		this.vgame = vgame;
		this.soundbox = soundbox;
	}
	public abstract void execute ();
}
class DummyCommand extends Command {
	public DummyCommand(Tv tv, SetTopBox settopbox, VGame vgame, SoundBox soundbox) {
		super(tv,settopbox,vgame,soundbox);
	}
	@Override
	public void execute() {
		System.out.println("i am dummy, yet to be operational ....");
	}
}
class FatherNewsTvCommand extends Command {
	public FatherNewsTvCommand(Tv tv, SetTopBox settopbox, VGame vgame, SoundBox soundbox) {
		super(tv,settopbox,vgame,soundbox);
	}
	@Override
	public void execute() {
		System.out.println("News Channel Started ..");
		tv.av2Mode();
		settopbox.newsChannel();
		vgame.stopVGame();
		soundbox.increaseSound();
		System.out.println("Enjoy the News ..");
	}
}
class MotherSerialCommand extends Command {
	public MotherSerialCommand(Tv tv, SetTopBox settopbox, VGame vgame, SoundBox soundbox) {
		super(tv,settopbox,vgame,soundbox);
	}
	@Override
	public void execute() {
		System.out.println("Serial Channel Started ..");
		tv.av2Mode();
		settopbox.serialChannel();
		soundbox.increaseSound();
		System.out.println("Serial Channel Started");
	}
}
class Tv {
	public void av1Mode() {
		System.out.println("Av1 Mode ..");
	}
	public void av2Mode() {
		System.out.println("Av2 Mode ..");
	}
}
class SetTopBox {
	public void newsChannel() {
		System.out.println("news Channel Started ..");
	}
	public void serialChannel() {
		System.out.println("serial Channel Started ..");
	}
}
class VGame {
	public void stopVGame() {
		System.out.println("vgame stopped ...");
	}
}
class SoundBox {
	public void increaseSound() {
		System.out.println("Sound is Increased ..");
	}
}
package clone;

public class CloneDemo {
	public static void main(String[] args) throws Exception {
		Sheep mothersheep = new Sheep();
		mothersheep.name = "I am mother Sheep";
		Sheep dolly = mothersheep.createClone();
		dolly.name = "I am Dolly";
		mothersheep.print();
		dolly.print();
		System.out.println(mothersheep.name);
		System.out.println(dolly.name);
		
	}
}
class Sheep implements Cloneable {
	String name;
	public Sheep() {
		System.out.println("sheep cons called ...");
	}
	public void print() {
		System.out.println("The name is " +name);
	}
	public Sheep createClone() throws CloneNotSupportedException {
		return (Sheep) super.clone();
	}
}
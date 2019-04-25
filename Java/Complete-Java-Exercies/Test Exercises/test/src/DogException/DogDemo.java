package DogException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DogDemo {
	public static void main(String[] args) throws Exception {
		String itemName;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		itemName = br.readLine();
		Item item = (Item)Class.forName("DogException." + itemName).getDeclaredConstructor().newInstance();
		Child child = (Child)Class.forName("DogException.Child").getDeclaredConstructor().newInstance();
		Dog dog = (Dog)Class.forName("DogException.Dog").getDeclaredConstructor().newInstance();
		child.playWithDog(dog, item);
		
	}
}
abstract class Item { 
	abstract public void handle()throws DogException;
}
class Stick extends Item {
	public void handle() throws DogException {
		throw new DogBarkException();
	}
}
class Stone extends Item {
	public void handle() throws DogException {
		throw new DogBiteException();
	}
}
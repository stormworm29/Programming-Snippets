package DogException;

public class Dog {
	public void play(Item item) {
		try {
			item.handle();
		} catch (DogException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}

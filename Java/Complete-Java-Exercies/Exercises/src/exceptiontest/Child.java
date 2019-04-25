package exceptiontest;

public class Child {
	public void playWithDog ( Dog dog, String item ) throws Exception {
		try {
			dog.play(item);
		}catch(DogException de) {
			de.visit();
		}
	}
}

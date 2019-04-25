package DogException;

public class CustomException {

}
abstract class DogException extends Exception{

}
class DogBiteException extends DogException {
	public DogBiteException() {
		System.out.println("The Dog is about to bite, run ...");
	}
	@Override
	public String toString() {
		return "Custom Statement : Dog Bite Exception";
	}
}
class DogBarkException extends DogException {
	public DogBarkException() {
		System.out.println("Dog is afraid, leave the stick it wont bite");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Custom Statement : Dog Bark Exception";
	}
}
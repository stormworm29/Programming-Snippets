package exceptiontest;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class DogDemo {
	public static void main(String[] args) throws Exception{
		Dog dog = new Dog();
		Child child = new Child();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Item : ");
		String item = br.readLine();
		child.playWithDog(dog, item);
	}
}

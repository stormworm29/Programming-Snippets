package day1;

public class Exfive {
	int numbers[] = { 1,2,3,4,5,6,7,8,9 };
	public static void main(String[] args) {
		Exfive obj = new Exfive();
		System.out.println("The Average of the array of numbers is: " + obj.average(obj.numbers));
	}
	public int average(int numbers[]) {
		int average = 0;
		for (int i = 0; i < numbers.length; i++) {
			average += numbers[i];
		}
		System.out.println(average);
		average /= numbers.length;
		return average;
	}
}

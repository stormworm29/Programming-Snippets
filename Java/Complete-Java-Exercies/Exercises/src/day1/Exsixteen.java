package day1;

public class Exsixteen {
	public static void main(String[] args) {
		int numbers[] = { 1,2,3,4,5,6,7,8,9 };
		int search = 4;
		Exsixteen.index(numbers, search);	
	}
	public static void index(int numbers[], int search) {
		int count = 0;
		System.out.print("The Locations of the Search Elements are: ");
		for(int i = 0 ; i < numbers.length; i++) {
			if(numbers[i] == search) {
				System.out.println(i + " ");
				count++;
			}
		}
		System.out.println("The Total number of Occurences are: " + count);
	}
}

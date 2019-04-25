package day1;

public class Exeight {
	public static void main(String[] args) {
		int numbers[] = { 1,2,3,4,5,6,7,8,9 };
		int search = 4;
		System.out.println( "Location of the Search element is: " + Exeight.index(numbers, search));
		
	}
	public static int index(int numbers[], int search) {
		int i;
		for(i = 0 ; i < numbers.length; i++) {
			if(numbers[i] == search) 
				return i+1;
		}
		return -1;
	}
}

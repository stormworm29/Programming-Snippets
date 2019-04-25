package day1;

public class Exthirteen {
	public static void main(String[] args) {
		int marks[][] = { {90, 80}, {95, 90}, {85, 90} };
		int sum = 0;
		for(int i = 0; i < marks.length ; i++) {
			for(int j = 0; j < marks[i].length; j++) {
				sum += marks[i][j];
			}
			System.out.println("Total marks of Student " + (i+1) + " is: " + sum + "\nAverage of the Student " + (i+1) + " is : " + (sum / marks[i].length));
		}
	}
}

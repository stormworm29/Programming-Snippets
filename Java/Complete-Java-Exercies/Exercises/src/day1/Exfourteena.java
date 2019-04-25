package day1;

public class Exfourteena {
	public static void main(String[] args) {
		int marks[][] = { {90, 80}, {95, 90}, {85, 90} }; // Marks of the Students
		int sum = 0; //  Variable to Hold the total sum
		for(int i = 0; i < marks.length ; i++) {
			for(int j = 0; j < marks[i].length; j++) {
				sum += marks[i][j];
			}
			// print out the total and average
			System.out.println("Total marks of Student " + (i+1) + " is: " + sum + "\nAverage of the Student " + (i+1) + " is : " + (sum / marks[i].length));
		}
	}
}

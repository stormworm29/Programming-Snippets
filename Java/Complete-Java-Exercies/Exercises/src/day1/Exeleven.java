package day1;

public class Exeleven {
	public static void main(String[] args) {
		int matrix[][] = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}  };
		int inc = 1;
		int count = inc;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
				count--;
				if(count == 0) {
					System.out.println();
					count = ++inc;
				}
			}
		}
	}
}

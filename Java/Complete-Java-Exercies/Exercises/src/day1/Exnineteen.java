package day1;

public class Exnineteen {
	public static void main(String[] args) {
		int array[][] = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}  };
		for(int j = 0; j < array.length; j++){
		    for(int i = array[j].length-1; i >-1; i--) {
		    	System.out.print(array[j][i] + " ");
		    }
		    System.out.println();
		}
	}
}

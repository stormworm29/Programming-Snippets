package day1;

public class Extwenty {
	public static void main(String[] args) {
		int array[][] = { {1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}  };
		for(int i=0; i < array.length; i++) {
			int max = array[i][0];
			for(int j=0;j<array[i].length;j++) {
				if(array[i][j] > max) 
					max =array[i][j];
			}
			System.out.println("The max of Row " + i + " is : " + max);
		}
	}
}

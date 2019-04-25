package day1;
public class Exnine {
	static void reverse(Integer a[]) 
    { 
        for( int i = a.length-1; i > -1; i-- ) {
        	System.out.print(a[i] + " ");
        }
    }
	public static void main(String[] args) {
		Integer numbers[] = { 1,2,3,4,5,6,7,8,9 };
		Exnine.reverse(numbers);
	}
}

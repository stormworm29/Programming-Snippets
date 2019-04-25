package utilpack;

public class VarArgsDemo {
	public void method(int ...a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		VarArgsDemo obj = new VarArgsDemo();
		obj.method(1,2,3,4,5,6,7,8,9);
		
	}
}

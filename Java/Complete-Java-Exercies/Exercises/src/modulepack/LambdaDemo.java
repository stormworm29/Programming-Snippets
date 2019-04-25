package modulepack;

public class LambdaDemo {
	public static int add(int...i) {
		int temp=0;
		for(int t:i) {
			temp=temp+t;
		}
		return temp;
	}
	public static void main(String[] args) {
		// Use JDk 11 
		
		Addition add = new Addition() {

			@Override
			public int doAddition(int... i) {
				int temp = 0;
				for(int t:i) {
					temp=temp+t;
				}
				return temp;
			}
		};
		System.out.println("Anonymous Addition .. " + add.doAddition(1,2,3,4));
		Addition add2 = LambdaDemo::add;
		System.out.println("Method Ref Addition .. " + add2.doAddition(1,2,3,4,5));
		Addition add3 = (int... i) -> {
			int temp=0;
			for(int t:i) {
				temp=temp+t;
			}
			return temp;
		};
		System.out.println("Lambda referencing .. "+ add3.doAddition(1,2,3,4,5,6));
	}
}
interface Addition {
	public int doAddition(int... i);
}

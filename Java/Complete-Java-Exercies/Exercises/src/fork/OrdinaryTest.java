package fork;

public class OrdinaryTest {
public static void main(String[] args) {
	Problem test=new Problem();
	long sum=0;int salary=0;
	for (int i = 0; i < test.getList().length; i++) {
        sum += test.getList()[i];
        salary+=test.calculateSalary(sum);
}
System.out.println("Done. Result: " + sum +" salary "+salary);
}
}

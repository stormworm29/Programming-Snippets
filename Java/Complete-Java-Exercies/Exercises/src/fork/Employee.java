package fork;

public class Employee {
	int i=1;
	public int calculateSalary(){
		try{Thread.sleep(100);}catch(Exception e){}
		return ++i;
	}
}

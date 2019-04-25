package xsdactivity;

public class Company {

    private String name;

    private EmployeeList EmployeeList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeList getEmployeeList() {
		return EmployeeList;
	}

	public void setEmployeeList(EmployeeList employeeList) {
		EmployeeList = employeeList;
	}
}

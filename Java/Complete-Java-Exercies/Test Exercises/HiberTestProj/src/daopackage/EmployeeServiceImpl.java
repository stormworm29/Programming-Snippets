package daopackage;

import java.util.List;

public class EmployeeServiceImpl extends EmployeeServiceDAO{
	
	private DAO dao;

	@Override
	public EmployeePojo findEmployee(int id) {
		return dao.findEmployee(id);
	}

	@Override
	public void deleteObject(Object o) {
		dao.deleteObject(o);
	}

	@Override
	public List<EmployeePojo> findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public float getSalary(int id) {
		return dao.getSalary(id);
	}

	@Override
	public void saveObject(Object o) {
		dao.saveObject(o);
	}

	@Override
	public void updateEmployee(EmployeePojo e) {
		dao.updateEmployee(e);
	}

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

}

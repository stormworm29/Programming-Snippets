package factorypack;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class JDBCTemplate {
	private DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	public void met()
	{
		JdbcTemplate jt=new JdbcTemplate(datasource);
		int noofemployees=jt.queryForInt("select count(*) from employee");
		System.out.println("No of employees..:"+noofemployees);
	}
	public void met1(int eid)  {
		SqlParameterSource namedParameters = new MapSqlParameterSource("eid", eid);
		NamedParameterJdbcTemplate jt = new NamedParameterJdbcTemplate(datasource);
		String ename  = jt.queryForObject("Select ename from employee where eid = :eid", namedParameters, String.class);
		System.out.println("Employee name : " + ename);
	}
	public void met2(int eid) {
		SqlParameterSource namedParameters = new MapSqlParameterSource("eid", eid);
		NamedParameterJdbcTemplate jt = new NamedParameterJdbcTemplate(datasource);
		Employee e  = jt.queryForObject("Select * from employee where eid = :eid", namedParameters, new MyRowMapper());
		System.out.println("Employee Id : " + e.getEid() + "\nEmployee name : " + e.getEname() + "\nEmployee Salary : " + e.getEsalary());
	}
	
}
class MyRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee emp=new Employee();
		emp.setEid(rs.getInt(1));
		emp.setEname(rs.getString(2));
		emp.setEsalary(rs.getInt(3));
		return emp;
	}
}

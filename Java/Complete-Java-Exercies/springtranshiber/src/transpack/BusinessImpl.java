package transpack;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BusinessImpl implements Business{
	private DataSource ds;
	
	public DataSource getDs() {
		return ds;
	}
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	@Override
	public void credit() {
		try{ds.getConnection().setAutoCommit(false);}catch(Exception e){}
		JdbcTemplate jdbc=new JdbcTemplate(ds);
		jdbc.update("insert into employee values (100,'somesh',200)");
		System.out.println("ds...."+ds);
		
	}
	@Override
	public void debit()throws Exception {
		try{ds.getConnection().setAutoCommit(false);}catch(Exception e){}
		JdbcTemplate jdbc=new JdbcTemplate(ds);
		jdbc.update("insert into employee values (400,'rajesh',100)");
		
		//throw new RuntimeException();
		
	}
}

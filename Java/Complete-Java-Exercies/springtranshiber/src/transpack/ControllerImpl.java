package transpack;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ControllerImpl implements Controller{
	private Business bi;
private DataSource ds;
	
	public DataSource getDs() {
		return ds;
	}
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
public Business getBi() {
		return bi;
	}
	public void setBi(Business bi) {
		this.bi = bi;
	}
@Override
public void doBusiness() throws Exception{
//	try{ds.getConnection().setAutoCommit(false);}catch(Exception e){}
//	JdbcTemplate jdbc=new JdbcTemplate(ds);
//	jdbc.update("insert into vemployee values (2,'MAIN',200)");
	bi.credit();
	bi.debit();
	//throw new RuntimeException();
}
}

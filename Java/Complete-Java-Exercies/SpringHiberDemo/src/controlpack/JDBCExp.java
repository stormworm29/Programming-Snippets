package controlpack;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCExp {
	JdbcTemplate jdbcTemplate;
	DataSource datasource;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		jdbcTemplate=new JdbcTemplate(datasource);
		this.datasource = datasource;
	}

	public void call()
	{
		int rowCount = 
			this.jdbcTemplate.queryForObject("select count(*) from users",Integer.class);
	}
}

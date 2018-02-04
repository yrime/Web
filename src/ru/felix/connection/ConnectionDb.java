package ru.felix.connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionDb implements InitializingBean {
	
	//private securityTriger;
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
		
	public JdbcTemplate getJdbcTemplate() {
		if(jdbcTemplate == null) {
			throw new BeanCreationException("Null JdbcTemplate");
		}
		return this.jdbcTemplate;
	}
	
	/*public Object query(String query, String type) {
		
		switch(type) {
			case "SHOW":
			case "show":
				return null;
			case "SELECT":
			case "select":
				return null;
			case "INSERT":
			case "insert":
				return null;
			case "UPDATE":
			case "update":
				return null;
			case "DELETE":
			case "delete":
				return null;
			case "DROP":
			case "drop":
				return null;
			case "CASTOM":
				return null;
			default:
				break;
		}
		
		return jdbcTemplate.queryForList(
                "select * from salle"               ); 
	}
	*/
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		this.jdbcTemplate = jdbcTemplate;
		//jdbcTemplate.q
	}
	
	public void afterPropertiesSet() throws Exception {
		if(dataSource == null) {
			throw new BeanCreationException("Must be set DataSource");
		}
		
		if(jdbcTemplate == null) {
			throw new BeanCreationException("Null JdbcTemplate");
		}
	}
	
	public String toString() {
		return "datasource " + this.dataSource + " Jdbctemplate " + this.jdbcTemplate;
	}
	
}

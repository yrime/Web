package ru.felix.connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionDb implements InitializingBean {
	
	//private securityTriger;
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	private QueryService queryService;
	
	public JdbcTemplate getJdbcTemplate() {
		if(jdbcTemplate == null) {
			throw new BeanCreationException("Null JdbcTemplate");
		}
		return this.jdbcTemplate;
	}
	
	public Object query(String query, String type) {
		return queryService.getAllPlace();
	}
	
	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}
	
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

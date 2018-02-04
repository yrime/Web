package ru.felix.teatre.factory;

import org.springframework.jdbc.core.JdbcTemplate;

import ru.felix.teatre.Teatrable;

public class TeatreFactory {
	public void create(JdbcTemplate jdbc, Teatrable teatre) {
		teatre.setSalles(null);
	}
}

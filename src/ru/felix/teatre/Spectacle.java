package ru.felix.teatre;

import java.util.Date;

public class Spectacle implements Spectaclable {

	private String name;
	
	private Spectacle() {
		// TODO Auto-generated constructor stub
	}
	
	public Spectacle(String name) {
		this.Spectacle(name, null, null);
	}
	
	private void Spectacle(String name2, Date object, String object2) {
		this.name = name2;
	}

	@Override
	public String getSpectacleName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

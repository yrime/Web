package ru.felix.teatre;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teatre implements Teatrable, Serializable {

	private HashMap<String, Sallable> salles;
	private ArrayList<Spectaclable> spectacles;
	
	private ArrayList<Afishable> link;
	
	private static Teatre instance;
	
	static {
		instance = new Teatre();
	}
	
	private Teatre() {}
	
	public Teatre getInstance() {
		if(this.instance == null) {
			instance = new Teatre();
			//throw new NullPointerException("Object instance not initialization");
		}
		return this.instance;
	}
	
	public Map<String, Sallable> getSalles() {
		if(salles == null) {
			throw new NullPointerException("you must initializing salles");
		}
		return this.salles;
	}

	public void setSalles(Map<String, Sallable> salles) {
		if(this.salles == null) {
			this.salles = (HashMap<String, Sallable>) salles;
		}else {
			System.out.println("salles it was initializing");
		}
	}

	public Sallable getSalle(String salleId) {
		if(salles == null) {
			throw new NullPointerException("you must initializing salles");
		}
		return this.salles.get(salleId);
	}

	public void setSalle(String salleKey, Sallable salle) {
		if(this.salles == null) {
			this.salles = new HashMap<String, Sallable>();
			//throw new NullPointerException("you must initializing salles");
		}
		this.salles.put(salleKey, salle);
	}

	public List<Spectaclable> getSpectacles() {
		if(this.spectacles == null) {
			throw new NullPointerException("spectacles must be initializing");
		}
		return this.spectacles;
	}

	public void setSpectacles(List<Spectaclable> spectacles) {
		if(this.spectacles == null) {
			this.spectacles = (ArrayList<Spectaclable>) spectacles;
		}else {
			System.out.println("Spectacles it was initializing");
		}
	}

	public void setSpectacle(Spectaclable spectacle) {
		if(this.spectacles == null) {
			this.spectacles = new ArrayList<Spectaclable>();
		}
		this.spectacles.add(spectacle);
	}

	public List<Afishable> getLink() {
		if(link == null) {
			throw new NullPointerException("Link of affichable is null");
		}
		return this.link;
	}

	public void setLink(List<Afishable> link) {
		if(this.link == null) {
			this.link = (ArrayList<Afishable>) link;
		}else {
			System.out.println("link it is initializing");
		}
	}

	public void setLink(Afishable link) {
		if(this.link == null) {
			this.link = new ArrayList<Afishable>();
		}
		this.link.add(link);
	}

}

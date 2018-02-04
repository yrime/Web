package ru.felix.teatre;

import java.util.Date;
//Affiche or Afisha or Poster? This class implemants 3 param from teatre
public final class Afisha implements Afishable {

	private Date data;
	private Spectaclable spect;
	private Sallable salle;
	
	private Afisha() {	}
	private Afisha(Spectaclable spect, Date date, Sallable salle) {
		this.spect = spect;
		this.data = date;
		this.salle = salle;
	}
	
	public Spectaclable getSpectacle() {
		return this.spect;
	}

	public Sallable getSalle() {
		// TODO Auto-generated method stub
		return this.salle;
	}

	public Date getDate() {
		// TODO Auto-generated method stub
		return this.data;
	}

}

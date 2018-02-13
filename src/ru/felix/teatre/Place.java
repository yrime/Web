package ru.felix.teatre;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="salle")
public class Place implements Placable, Comparable<Object>, Serializable {

	private int row;
	private int place;
	private byte status = 0;
	private int price;
	
	public int compareTo(Object obj) {
		if(
			row == ((Placable)obj).getRow() &&
			place == ((Placable)obj).getPlace()
		){
			return 0;
		}
		return -1;
	}

	private void Place(int row, int place, byte status, int price) {
		this.row = row;
		this.place = place;
		this.status = status;
		this.price = price;
	}
	
	public Place(int row, int place, byte status, int price) {
		this.Place(row, place, status, price);
	}
	public Place(int row, int place, int price) {
		this.Place(row, place, (byte)0, price);
	}
	public Place(int row, int place, byte status) {
		this.Place(row, place, status, 0);
	}
	public Place(int row, int place) {
		this.Place(row, place, (byte)0, 0);
	}
	private Place() {}
	
	@Column(name="row")
	public int getRow() {
		return this.row;
	}
	@Column(name="place")
	public int getPlace() {
		return this.place;
	}
	@Column(name="status")
	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

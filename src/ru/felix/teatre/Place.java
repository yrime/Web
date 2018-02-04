package ru.felix.teatre;

public class Place implements Placable, Comparable<Object> {

	private int row;
	private int place;
	private byte status = 0;
	private int price;
	
	@Override
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
	@Override
	public int getRow() {
		return this.row;
	}

	@Override
	public int getPlace() {
		return this.place;
	}

	@Override
	public byte getStatus() {
		return this.status;
	}

	@Override
	public void setStatus(byte status) {
		this.status = status;
	}

	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

}

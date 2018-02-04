package ru.felix.teatre;

public interface Placable{
	public int getRow();
	public int getPlace();
	
	public byte getStatus();
	public void setStatus(byte status);
	
	public int getPrice();
	public void setPrice(int price);
}

package ru.felix.teatre;

import java.util.List;
import java.util.Map;

public interface Sallable {
	public Map<Integer, List<Place>> getSalle();
	public void setSalle(Map<Integer, List<Place>> salle);
	
	public void setPlace(Place place);
	
	public Placable getPlace(int row, int place);
	
	public int getRowMax();
	public int getPlaceMax();
	
	public int getPlaceMax(int row);
}

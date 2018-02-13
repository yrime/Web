package ru.felix.teatre;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Salle implements Sallable, Serializable {
	
	private HashMap<Integer, List<Place>> places;
	private String name = "";
	
	public Salle(HashMap<Integer, List<Place>> array) {
		this.places = array;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	private void checkToNull(Object obj) {
		//return (obj == null) ? true : false;
		if(obj == null) {
			throw new NullPointerException("Object is NULL: " + obj.getClass().getName());
		}
		//return true;
	}
	
	private boolean containsAndReplace(List<Place> list, Object obj) {
		for(int i = 0; i < list.size(); ++i) {
			if(list.get(i).compareTo(obj) == 0) {
				list.set(i, (Place) obj);
			}
		}
		return false;	
	}
	
	public Map<Integer, List<Place>> getSalle() {
		this.checkToNull(this.places);
		return this.places;
	}

	public void setSalle(Map<Integer, List<Place>> salle) {
		if(this.places == null) {
			this.places = (HashMap<Integer, List<Place>>) salle;
		}else {
			System.out.println("Salle it was initialiation");
		}
	}

	public void setPlace(Place place) {
		int row = place.getRow();
		if(this.places == null) {
			this.places = new HashMap<Integer, List<Place>>();
		}
		if(this.places.containsKey(row)) {
			this.places.get(row).set(place.getPlace(), place);
		}else {
			ArrayList<Place> arrayList = new ArrayList<Place>();
			arrayList.add(place.getPlace(), place);
			this.places.put(row, arrayList);
		}
	}
 
	public Placable getPlace(int row, int place) {
		this.checkToNull(this.places);
		return this.places.get(row).get(place);
	}

	public int getRowMax() {
		this.checkToNull(this.places);
		return (this.places.keySet().size() - 1);
	}

	public int getPlaceMax() {
		this.checkToNull(this.places);
		int max = 0;
		int i;
		for(Map.Entry<Integer, List<Place>> entry : this.places.entrySet()) {
			i = entry.getValue().size() - 1;
			if(i > max) {
				max = i;
			}
		}
		return max;
	}

	public int getPlaceMax(int row) {
		this.checkToNull(this.places);
		if(this.places.containsKey(row)) {
			return this.places.get(row).size() - 1;
		}else {
			throw new NullPointerException("This row: " + row + " doesnt exist");
		}
	}

}

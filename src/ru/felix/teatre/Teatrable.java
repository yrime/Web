package ru.felix.teatre;

import java.util.List;
import java.util.Map;

public interface Teatrable {
	public Map<String, Sallable> getSalles();
	public void setSalles(Map<String, Sallable> salles);
	public Sallable getSalle(String salleId);
	public void setSalle(String salleKey, Sallable salle);
	
	public List<Spectaclable> getSpectacles();
	public void setSpectacles(List<Spectaclable> spectacles);
	public void setSpectacle(Spectaclable spectacle);
	
	public List<Afishable> getLink();
	public void setLink(List<Afishable> link);
	public void setLink(Afishable link);
}

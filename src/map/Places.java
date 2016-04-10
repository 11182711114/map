package map;

import java.util.TreeMap;
import java.util.TreeSet;

public class Places{
	private TreeMap placesName = new TreeMap<>(Place.getNameComparator());
	private TreeSet<Place> placesLocation = new TreeSet<>(Place.getLocationComparator());

	public Places(){
		
	}
	public boolean addPlace(Place p){
		
		return false;		
	}
	//getters and setters
	public TreeMap getPlacesName() {
		return placesName;
	}

	public void setPlacesName(TreeMap placesName) {
		this.placesName = placesName;
	}

	public TreeSet getPlacesLocation() {
		return placesLocation;
	}

	public void setPlacesLocation(TreeSet placesLocation) {
		this.placesLocation = placesLocation;
	}
}

package map;

import java.util.Comparator;

import javax.swing.JComponent;

public class Place extends JComponent{
	private int x, y;

	private String name;
	private boolean isVisible;
	private boolean isOpen;
	
	public Place(int x, int y, String name){
		this.x = x;
		this.y = y;
		this.name = name;	
		this.isVisible = true;
		this.isOpen = false;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int[] getCoordinates(){
		return new int[] {x,y};
	}
	public String getName() {
		return name;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public static Comparator<Place> getNameComparator(){
		return new SortName();
	}
	public static Comparator<Place> getLocationComparator(){
		return new SortLocation();
	}
	private static class SortName implements Comparator<Place>{
		@Override
		public int compare(Place first, Place second) {
			return first.getName().compareToIgnoreCase(second.getName());
		}
	}
	private static class SortLocation implements Comparator<Place>{
		protected static final int SECOND_HIGHER = -1;
		protected static final int SAME = 0;
		protected static final int FIRST_HIGHER = 1;
		@Override
		public int compare(Place first, Place second) {
			Integer firstX = first.getX();
			Integer firstY = first.getY();
			
			Integer secondX = second.getX();
			Integer secondY = second.getY();
			
			int deltaX = Integer.compare(firstX, secondX);
			if(deltaX == 0){
				return Integer.compare(firstY, secondY);
			}
			return deltaX;
		}		
	}
}

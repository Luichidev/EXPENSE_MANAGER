package code;

import java.util.ArrayList;

public class AppManager {
	private ArrayList<Trip> trips;
	
	
	AppManager() {
		trips = new ArrayList<Trip>();
	}
	
	public void AddTrip(Trip t) {
		trips.add(t);
	}
	public String toString(){
		String info = "";
		
		for (Trip t : trips) {
			info += "Listado de Viajes: \n";
			info += t.toString();
		}
		
		return info;
	}
}

package problem;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	int ID;
	int totalScore = 0;
	int streetsToIgnore = 0;
	List<String> streets = new ArrayList<String>();
	
	public Intersection(int ID) {
		this.ID = ID;
		// TODO Auto-generated constructor stub
	}
	public void addStreet(String name) {
		streets.add(name);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<String> getStreets() {
		return streets;
	}

	public void setStreets(List<String> streets) {
		this.streets = streets;
	}
	
	
	public void incScore(int score) {
		totalScore += score;
	}
	public void incStToIg() {
		streetsToIgnore ++;
	}
	
	
}

package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Car {

	static int maxCarScore = -1;
	int numbStreets;
	int rating = 0;

	ArrayList<String> streets;

	public Car(int numb) {
		this.numbStreets = numb;
		streets = new ArrayList<String>();
	}
	
	public void calculateRating(HashMap<String, Street> streets2) {
		for (int i = 0; i < streets.size(); i++) {
			rating += streets2.get(streets.get(i)).getCost();
		}
		if (maxCarScore < rating) {
			maxCarScore = rating;
		}
	}

	public void addStreet(String streetName) {
		streets.add(streetName);
	}

	public int getNumb_streets() {
		return numbStreets;
	}

	public void setNumb_streets(int numb_streets) {
		this.numbStreets = numb_streets;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public ArrayList<String> getStreets() {
		return streets;
	}

	public void setStreets(ArrayList<String> streets) {
		this.streets = streets;
	}

	public static int getMaxCarScore() {
		return maxCarScore;
	}

	public static void setMaxCarScore(int maxCarScore) {
		Car.maxCarScore = maxCarScore;
	}

	
}

package problem;

public class Street {

	String name;
	int duration;
	int startInt;
	int endInt;
	int score;
	int greenTime;
	int numbCars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getStartInt() {
		return startInt;
	}

	public void setStartInt(int startInt) {
		this.startInt = startInt;
	}

	public int getEndInt() {
		return endInt;
	}

	public void setEndInt(int endInt) {
		this.endInt = endInt;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void addCost(int duration) {
		score += duration;
	}

	public int getNumbCars() {
		return numbCars;
	}
	
	public void incNumbCars() {
		numbCars ++;
	}

	public void setNumbCars(int numbCars) {
		this.numbCars = numbCars;
	}

	public int getGreenTime() {
		return greenTime;
	}

	public void setGreenTime(int greenTime) {
		this.greenTime = greenTime;
	}
	
	
	

}
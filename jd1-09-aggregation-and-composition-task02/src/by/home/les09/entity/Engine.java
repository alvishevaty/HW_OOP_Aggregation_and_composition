package by.home.les09.entity;

public class Engine { 
	
	private int cylindersNumber;
	private double engineVolume;
	
	public Engine(){
		this.cylindersNumber = 0;
		this.engineVolume = 0;
	}
	
	public Engine(int cylindersNumber, double d) {
		this.cylindersNumber = cylindersNumber;
		this.engineVolume = d;
	}

	public int getCylindersNumber() {
		return cylindersNumber;
	}

	public void setCylindersNumber(int cylindersNumber) {
		this.cylindersNumber = cylindersNumber;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cylindersNumber;
		long temp;
		temp = Double.doubleToLongBits(engineVolume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (cylindersNumber != other.cylindersNumber)
			return false;
		if (Double.doubleToLongBits(engineVolume) != Double.doubleToLongBits(other.engineVolume))
			return false;
		return true;
	}

	
	
}

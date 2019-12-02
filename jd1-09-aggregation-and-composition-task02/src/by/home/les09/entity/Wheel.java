package by.home.les09.entity;

public class Wheel {
	
	private String position;
	private double wheelPressure;
	
	public Wheel(){
		this.position = "";
		this.wheelPressure = 0;
	}
	
	public Wheel(String position, double wheelPressure) {
		this.position = position;
		this.wheelPressure = wheelPressure;
	}

	public double getWheelPressure() {
		return wheelPressure;
	}

	public void setWheelPressure(int wheelPressure) {
		this.wheelPressure = wheelPressure;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setWheelPressure(double wheelPressure) {
		this.wheelPressure = wheelPressure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		long temp;
		temp = Double.doubleToLongBits(wheelPressure);
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
		Wheel other = (Wheel) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (Double.doubleToLongBits(wheelPressure) != Double.doubleToLongBits(other.wheelPressure))
			return false;
		return true;
	}

	
	
}

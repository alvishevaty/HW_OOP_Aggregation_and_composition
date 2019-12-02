package by.home.les09.entity;

public class Tank {
	
	private int volume;
	private int fuelRemaining;
	private String fuelType;
	
	public Tank(){
		this.volume = 0;
		this.fuelRemaining = 0;
		this.fuelType = "";
	}
	
	public Tank(int volume, int fuelRemaining, String fuelType) {
		this.volume = volume;
		this.fuelType = fuelType;
		this.fuelRemaining = fuelRemaining;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	public int getFuelRemaining() {
		return fuelRemaining;
	}

	public void setFuelRemaining(int fuelRemaining) {
		this.fuelRemaining = fuelRemaining;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fuelRemaining;
		result = prime * result + ((fuelType == null) ? 0 : fuelType.hashCode());
		result = prime * result + volume;
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
		Tank other = (Tank) obj;
		if (fuelRemaining != other.fuelRemaining)
			return false;
		if (fuelType == null) {
			if (other.fuelType != null)
				return false;
		} else if (!fuelType.equals(other.fuelType))
			return false;
		if (volume != other.volume)
			return false;
		return true;
	}

		
	
}

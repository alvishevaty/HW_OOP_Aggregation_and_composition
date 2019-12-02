package by.home.les09.entity;

import java.util.List;

public class Region {
	
	private String name;
	private City centralCity;
	private List<District> districtList;
	
	public Region(String name, City centralCity, List<District> district) {
		this.name = name;
		this.centralCity = centralCity;
		this.districtList = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCentralCity() {
		return centralCity;
	}

	public void setCentralCity(City centralCity) {
		this.centralCity = centralCity;
	}

	public List<District> getDistrictList() {
		return districtList;
	}

	public void setDistrictList(List<District> districtList) {
		this.districtList = districtList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centralCity == null) ? 0 : centralCity.hashCode());
		result = prime * result + ((districtList == null) ? 0 : districtList.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Region other = (Region) obj;
		if (centralCity == null) {
			if (other.centralCity != null)
				return false;
		} else if (!centralCity.equals(other.centralCity))
			return false;
		if (districtList == null) {
			if (other.districtList != null)
				return false;
		} else if (!districtList.equals(other.districtList))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

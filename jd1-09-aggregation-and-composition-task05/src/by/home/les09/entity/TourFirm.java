package by.home.les09.entity;

import java.util.ArrayList;
import java.util.List;

public class TourFirm {

	private String name;
	private List<Tour> toursList;

	{
		this.name = "";
		this.toursList = new ArrayList<>();
	}

	public TourFirm(String name, List<Tour> toursList) {
		this.toursList = toursList;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tour> getToursList() {
		return toursList;
	}

	public void setToursList(List<Tour> toursList) {
		this.toursList = toursList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((toursList == null) ? 0 : toursList.hashCode());
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
		TourFirm other = (TourFirm) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (toursList == null) {
			if (other.toursList != null)
				return false;
		} else if (!toursList.equals(other.toursList))
			return false;
		return true;
	}

}

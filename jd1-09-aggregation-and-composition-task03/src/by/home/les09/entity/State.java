package by.home.les09.entity;

import java.util.List;

public class State {

	private String name;
	private City capital;
	private double square;
	private List<Region> regionList;
	
	public State(String name, City capital, double square, List<Region> regionList) {
		this.name = name;
		this.capital = capital;
		this.square = square;
		this.regionList = regionList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public List<Region> getRegionList() {
		return regionList;
	}

	public void setRegionList(List<Region> regionList) {
		this.regionList = regionList;
	}
	
	
}

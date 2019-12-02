package by.home.les09.entity;

import java.util.ArrayList;
import java.util.List;

public class Automobile {
	
	private String brand;
	private String model;
	private int productionYear;
	private List<Wheel> wheel;
	private Tank tank;
	private Engine engine;
	
	public Automobile(){
		this.brand = "";
		this.model = "";
		this.productionYear = 0;
		this.wheel = new ArrayList<Wheel>();
		this.tank = new Tank();
		this.engine = new Engine();
	}
	
	public Automobile(String brand, String model, int productionYear){
		this.brand = brand;
		this.model = model;
		this.productionYear = productionYear;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public List<Wheel> getWheel() {
		return wheel;
	}

	public void setWheel(List<Wheel> wheel) {
		this.wheel = wheel;
	}

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + productionYear;
		result = prime * result + ((tank == null) ? 0 : tank.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
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
		Automobile other = (Automobile) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (productionYear != other.productionYear)
			return false;
		if (tank == null) {
			if (other.tank != null)
				return false;
		} else if (!tank.equals(other.tank))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}
	
	
}

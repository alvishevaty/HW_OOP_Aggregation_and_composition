package by.home.les09.logic;

import by.home.les09.entity.Automobile;
import by.home.les09.entity.Wheel;

public class AutomobileLogic {

	// Нужна ли дозаправка.
	public boolean needGasStation(Automobile auto) {
		if (auto.getTank().getFuelRemaining() <= 10) {
			return true;
		} else {
			return false;
		}
	}

	// Заправка
	public Automobile gasStation(Automobile auto) {
		if (needGasStation(auto) == true) {
			auto.getTank().setFuelRemaining(auto.getTank().getVolume());
		}
		return auto;
	}

	// Правильное ли количество колес:
	public boolean correctWheelsNumber(Automobile auto) {
		if (auto.getWheel().size() >= 4) {
			return true;
		} else {
			return false;
		}
	}

	// Нужно ли менять колесо:
	public boolean needWheelChange(Automobile auto) {
		boolean value = false;
		if (correctWheelsNumber(auto) == true) {
			for (int i = 0; i < auto.getWheel().size(); i++) {
				if (auto.getWheel().get(i).getWheelPressure() <= 0.5) {
					value = true;
					break;

				} else {
					value = false;
				}
			}
		} else
			value = true;

		return value;
	}

	// Замена колес
	public Automobile wheelChange(Automobile auto) {
		if (needWheelChange(auto) == true) {
			for (int i = 0; i < auto.getWheel().size(); i++) {
				if (auto.getWheel().get(i).getWheelPressure() <= 0.5) {
					String position = auto.getWheel().get(i).getPosition();
					auto.getWheel().set(i, new Wheel(position, 2.1));
				}
			}
		}
		return auto;
	}

	// Можно ли ехать:
	public boolean drive(Automobile auto) {
		if (needGasStation(auto) == false & correctWheelsNumber(auto) == true & needWheelChange(auto) == false) {
			return true;
		} else {
			return false;
		}
	}

}

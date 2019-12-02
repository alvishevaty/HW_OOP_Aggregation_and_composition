package by.home.les09.main;

import java.util.ArrayList;
import java.util.List;

import by.home.les09.entity.Automobile;
import by.home.les09.entity.Engine;
import by.home.les09.entity.Tank;
import by.home.les09.entity.Wheel;
import by.home.les09.logic.AutomobileLogic;
import by.home.les09.view.AutomobileView;

public class Main {

	public static void main(String[] args) {

		/*
		 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель, Бак.
		 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку
		 * автомобиля.
		 */
		
		List<Wheel> wheel = new ArrayList<Wheel>();
		wheel.add(new Wheel("переднее левое", 0.1));
		wheel.add(new Wheel("переднее правое", 2.1));
		wheel.add(new Wheel("заднее левое", 2.07));
		wheel.add(new Wheel("заднее правое", 2.05));
				
		Engine engine= new Engine(6, 3.0);
		Tank tank = new Tank(60, 7, "95");
		Automobile auto = new Automobile("BMW", "340i", 2019);
		AutomobileLogic automobileLogic = new AutomobileLogic();
		AutomobileView automobileView = new AutomobileView();
		
		auto.setWheel(wheel);
		auto.setTank(tank);
		auto.setEngine(engine);
		
		automobileView.printDriveStatus(auto);
				
		automobileView.printTankStatus(auto);
		automobileLogic.gasStation(auto);
		System.out.println("ПОСЛЕ ЗАПРАВКИ: ");
		automobileView.printTankStatus(auto);
		
		automobileView.printWheelStatus(auto);
		automobileLogic.wheelChange(auto);
		System.out.println("ПОСЛЕ ЗАМЕНЫ КОЛЕСА: ");
		automobileView.printWheelStatus(auto);
		
		automobileView.printDriveStatus(auto);
				
	}

}


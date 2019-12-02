package by.home.les09.view;

import by.home.les09.entity.Automobile;
import by.home.les09.logic.AutomobileLogic;

public class AutomobileView {

	AutomobileLogic automobileLogic = new AutomobileLogic();

	public void printTankStatus(Automobile auto) {
		System.out.println("• Информация о баке:");
		if (automobileLogic.needGasStation(auto) == true) {
			System.out.println("\tУ вас осталось " + auto.getTank().getFuelRemaining() + " литров.");
			System.out.println(
					"\tЗаедьте на заправку и залейте " + (auto.getTank().getVolume() - auto.getTank().getFuelRemaining())
							+ " литра " + auto.getTank().getFuelType() + "-го топлива до полного бака.");
		} else if (automobileLogic.needGasStation(auto) == false) {

			if (auto.getTank().getFuelRemaining() == auto.getTank().getVolume()) {
				System.out.println("\tУ вас полный бак.");
			} else {
				System.out.println("\tУ вас осталось " + auto.getTank().getFuelRemaining() + " литров.");
				System.out
						.println("\tВы можете залить " + (auto.getTank().getVolume() - auto.getTank().getFuelRemaining())
								+ " литров, но в данный момент топлива достаточно");
			}
		}
	}

	public void printWheelStatus(Automobile auto) {
		System.out.println("• Информация о колесах: ");
		if (automobileLogic.needWheelChange(auto) == true) {
			System.out.println("\tСудя по всему одно из колес проколото. Нужна замена.");
		} else {
			System.out.println("\tВсе колеса целые.");
		}
		
	}
	
	public void printDriveStatus(Automobile auto) {
		System.out.println("• Информация о возможности начать движение: ");
		if (automobileLogic.drive(auto) == true) {
			System.out.println("\tВсе показатели в норме, можно ехать.");
		} else {
			System.out.println("\tКажется вы устранили не все проблемы.");
		}
		
	}

}

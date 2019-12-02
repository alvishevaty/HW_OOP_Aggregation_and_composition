package by.home.les09.main;

import java.util.ArrayList;
import java.util.List;

import by.home.les09.entity.City;
import by.home.les09.entity.District;
import by.home.les09.entity.Region;
import by.home.les09.entity.State;
import by.home.les09.view.StateView;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 3. Создать объект класса Государство, используя классы Область, Район, Город.
		 * Методы: вывести на консоль столицу, количество областей, площадь, областные
		 * центры.
		 */
		
		List<District> mogilevRegion = new ArrayList<>();
			mogilevRegion.add(new District("Mogilevski", new City("Mogilev")));
			mogilevRegion.add(new District("Osipovicski", new City("Osipovici")));
		
		List<District> minskRegion = new ArrayList<>();
			minskRegion.add(new District("Minski", new City("Minsk")));
			minskRegion.add(new District("Borisovski", new City("Borisov")));
			
		List<District> grodnoRegion = new ArrayList<>();
			grodnoRegion.add(new District("Grodnenski", new City("Grodno")));
			grodnoRegion.add(new District("Lidski", new City("Lida")));

		List<Region> stateRegion = new ArrayList<>();
			stateRegion.add(new Region("Mogilevskaya", mogilevRegion.get(0).getCityList().get(0), mogilevRegion));
			stateRegion.add(new Region("Minskaya", minskRegion.get(0).getCityList().get(0), minskRegion));
			stateRegion.add(new Region("Grodnenskaya", grodnoRegion.get(0).getCityList().get(0), grodnoRegion));
		
			
		State belarus = new State("Belarus", minskRegion.get(0).getCityList().get(0), 207595, stateRegion);                                                                                                                                                                            
		
		StateView stateView = new StateView();
		
		stateView.print(belarus.getCapital().getName());
		stateView.print(belarus.getRegionList().size());
		stateView.print(belarus.getSquare());
		stateView.print(stateRegion);

	}
	
	

}

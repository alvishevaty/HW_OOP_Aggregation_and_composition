package by.home.les09.main;

import java.util.ArrayList;
import java.util.List;

import by.home.les09.entity.Food;
import by.home.les09.entity.Tour;
import by.home.les09.entity.TourFirm;
import by.home.les09.entity.TourType;
import by.home.les09.entity.Transport;
import by.home.les09.logic.TourFirmLogic;
import by.home.les09.view.TourView;

public class Main {

	public static void main(String[] args) {

		/*
		 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору
		 * туристической путевки различного типа (отдых, экскурсии, лечение, шопинг,
		 * круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
		 * транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
		 */

		List<Tour> tourList1 = new ArrayList<>();
		tourList1.add(new Tour(TourType.MUSICFEST, "Croatia", 11, "09.07.20", Transport.BUS, Food.BREAKFAST));
		tourList1.add(new Tour(TourType.CRUISE, "Finland", 7, "25.12.19", Transport.FERRY, Food.ALLINCLUSIVE));
		tourList1.add(new Tour(TourType.SHOPPING, "Lithuania", 2, "15.10.19", Transport.BUS, Food.NOFOOD));

		List<Tour> tourList2 = new ArrayList<>();
		tourList2.add(new Tour(TourType.RECREATION, "Spain", 10, "15.08.20", Transport.PLAIN, Food.BREAKFAST));
		tourList2.add(new Tour(TourType.TREATMENT, "Hungary", 7, "15.01.02", Transport.BUS, Food.ALLINCLUSIVE));
		tourList2.add(new Tour(TourType.TOURS, "Belarus", 1, "09.12.19", Transport.BUS, Food.NOFOOD));

		List<Tour> tourList3 = new ArrayList<>();
		tourList3.add(new Tour(TourType.MUSICFEST, "USA", 11, "25.03.20", Transport.PLAIN, Food.BREAKFAST));
		tourList3.add(new Tour(TourType.CRUISE, "Sweden", 5, "20.11.19", Transport.FERRY, Food.DINNER));
		tourList3.add(new Tour(TourType.SHOPPING, "Poland", 1, "07.12.19", Transport.BUS, Food.NOFOOD));

		List<TourFirm> tourFirmList = new ArrayList<>();
		tourFirmList.add(new TourFirm("Travel_House", tourList1));
		tourFirmList.add(new TourFirm("TEZ_TOUR", tourList2));
		tourFirmList.add(new TourFirm("Top_Tour", tourList3));

		TourView tourView = new TourView();
		TourFirmLogic tourFirmLogic = new TourFirmLogic();

		tourView.printTour(tourFirmLogic.findTour(tourFirmList.get(0), tourView.writeString("tour type"),
				tourView.writeString("country"), tourView.writeString("transport"), 11));

	}
}

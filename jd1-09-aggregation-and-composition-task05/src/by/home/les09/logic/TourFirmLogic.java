package by.home.les09.logic;

import java.util.ArrayList;
import java.util.List;

import by.home.les09.entity.Tour;
import by.home.les09.entity.TourFirm;
import by.home.les09.entity.TourType;

public class TourFirmLogic {

	// Поиск по турфирме и стране назначения
	public List<Tour> findTour(TourFirm tourFirm, String country) {
		List<Tour> myTour = new ArrayList<>();
		List<Tour> tourFirmTours = tourFirm.getToursList();

		for (Tour findTour : tourFirmTours) {
			if (findTour.getCountry().equals(country)) {
				myTour.add(findTour);
			}
		}
		return myTour;
	}

	// Поиск по турфирме, типу отдыха, стране назначения
	public List<Tour> findTour(TourFirm tourFirm, String tourType, String country) {
		List<Tour> myTour = new ArrayList<>();
		List<Tour> tourFirmTours = tourFirm.getToursList();

		for (Tour findTour : tourFirmTours) {
			if (findTour.getTourType().getTitle().equals(tourType) & findTour.getCountry().equals(country)) {
				myTour.add(findTour);
			}
		}
		return myTour;
	}

	// Поиск по турфирме, типу отдыха, стране назначения, типу транспорта,
	// количеству дней
	public List<Tour> findTour(TourFirm tourFirm, String tourType, String country, String transport, int days) {
		List<Tour> myTour = new ArrayList<>();
		List<Tour> tourFirmTours = tourFirm.getToursList();

		for (Tour findTour : tourFirmTours) {
			if (findTour.getTourType().getTitle().equals(tourType) & findTour.getCountry().equals(country)
					& findTour.getDays() == days & findTour.getTransport().getTitle().equals(transport)) {
				myTour.add(findTour);
			}
		}
		return myTour;
	}

}
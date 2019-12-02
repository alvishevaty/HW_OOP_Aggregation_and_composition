package by.home.les09.view;

import java.util.List;
import java.util.Scanner;

import by.home.les09.entity.Tour;

public class TourView {

	public int writeDays(String name) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter " + name + ": ");
		while (scanner.hasNextInt() == false) {
			String s = scanner.next();
			System.out.print("Enter " + name + ": ");
		}
		int days = scanner.nextInt();
		return days;
	}

	public String writeString(String name) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter " + name + ": ");
		String string = scanner.next();
		return string;
	}

	public void printTour(List<Tour> tours) {
		if (tours.size() == 0) {
			System.out.println("We do not have such tours. Change the data.");
		} else {
			for (int i = 0; i < tours.size(); i++) {

				System.out.print("\t• " + tours.get(i).getTourType().getTitle() + "\t" + tours.get(i).getCountry()
						+ "\t" + tours.get(i).getDays() + "\t" + tours.get(i).getDate() + "\t"
						+ tours.get(i).getTransport() + "\t" + tours.get(i).getFood() + "\n");
			}

		}
	}
	/*
	 * public void printTourFirmInfo(List<TourFirm> tourFirmList) { int count = 1;
	 * for (TourFirm firm : tourFirmList) { System.out.println(count + ". " +
	 * firm.getName() + ";"); count++; }
	 * 
	 * String tourFirmName = writeString("tour firm name");
	 * 
	 * int counter = 0; for (TourFirm firm : tourFirmList) { if
	 * (tourFirmName.equals(firm.getName())) { counter++; for (int i = 0; i <
	 * firm.getToursList().size(); i++) { System.out.print("\t• " +
	 * firm.getToursList().get(i).getTourType().getTitle() + "\t" +
	 * firm.getToursList().get(i).getCountry() + "\t" +
	 * firm.getToursList().get(i).getDays() + "\t" +
	 * firm.getToursList().get(i).getDate() + "\t" +
	 * firm.getToursList().get(i).getTransport() + "\t" +
	 * firm.getToursList().get(i).getFood() + "\n");
	 * 
	 * } } } if (counter == 0) { System.out.println("no such firms"); } }
	 * 
	 * public void findTour(List<TourFirm> tourFirmList) { String tourTypeName =
	 * writeString("tour type name");
	 * 
	 * List<Tour> newTourList = new ArrayList<>(); for (TourFirm firm :
	 * tourFirmList) { for (int j = 0; j < firm.getToursList().size(); j++) { if
	 * (tourTypeName.equals(firm.getToursList().get(j).getTourType().getTitle())) {
	 * newTourList.add(firm.getToursList().get(j));
	 * 
	 * } } } for (int i = 0; i < newTourList.size(); i++) { System.out .print("\t• "
	 * + newTourList.get(i).getTourType().getTitle() + "\t" +
	 * newTourList.get(i).getCountry() + "\t" + newTourList.get(i).getDays() + "\t"
	 * + newTourList.get(i).getDate() + "\t" + newTourList.get(i).getTransport() +
	 * "\t" + newTourList.get(i).getFood() + "\n"); } }
	 */
}

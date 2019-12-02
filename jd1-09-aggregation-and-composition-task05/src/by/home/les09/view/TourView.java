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
}

package by.home.les09.view;

import java.util.List;
import by.home.les09.entity.Region;

public class StateView {
	
	public void print(String capital) {
		System.out.println("♦ Capital: " + capital);
	}
	
	public void print(int regionNumber) {
		System.out.println("♦ The number of regions: " + regionNumber);
	}
	
	public void print(double square) {
		System.out.println("♦ State size: " + square + " km2");
	}
	
	public void print(List<Region> stateRegion) {
		System.out.println("♦ The list of the cities: ");
		for (int i = 0; i < stateRegion.size(); i++) {
			System.out.println("\t• " + stateRegion.get(i).getCentralCity().getName());
		}
	}
}

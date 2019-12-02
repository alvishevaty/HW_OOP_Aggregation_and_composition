package by.home.les09.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Client> bankClientsList;
	private String name;
	
	{
		this.bankClientsList = new ArrayList<>();
		this.name = "";
	}
	
	public Bank(String name) {
		this.name = name;
	}
	

	public List<Client> getBankClientsList() {
		return bankClientsList;
	}

	public void setBankClientsList(Client bankClient) {
		this.bankClientsList.add(bankClient);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankClientsList == null) ? 0 : bankClientsList.hashCode());
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
		Bank other = (Bank) obj;
		if (bankClientsList == null) {
			if (other.bankClientsList != null)
				return false;
		} else if (!bankClientsList.equals(other.bankClientsList))
			return false;
		return true;
	}
	
	
}

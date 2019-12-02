package by.home.les09.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String surname;
	private String name;
	private List<BankAccount> bankAccountList;
	
	{
		this.surname = "";
		this.name = "";
		this.bankAccountList = new ArrayList<>();
	}
	/*
	public Client(String surname, String name, BankAccount bankAccountList) {
		this.surname = surname;
		this.name = name;
		this.bankAccountList.add(bankAccountList);
	}
	*/
	
	public Client(String surname, String name) {
		this.surname = surname;
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BankAccount> getBankAccountList() {
		return bankAccountList;
	}

	public void setBankAccountList(BankAccount bankAccountList) {
		this.bankAccountList.add(bankAccountList);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankAccountList == null) ? 0 : bankAccountList.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Client other = (Client) obj;
		if (bankAccountList == null) {
			if (other.bankAccountList != null)
				return false;
		} else if (!bankAccountList.equals(other.bankAccountList))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
}

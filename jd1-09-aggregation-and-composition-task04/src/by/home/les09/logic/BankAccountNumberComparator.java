package by.home.les09.logic;

import java.util.Comparator;

import by.home.les09.entity.BankAccount;

public class BankAccountNumberComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount account1, BankAccount account2) {
		if (account1.getBankAccountNumber() > account2.getBankAccountNumber())
			return 1;
		else if (account1.getBankAccountNumber() < account2.getBankAccountNumber())
			return -1;
		else
			return 0;
	}
}

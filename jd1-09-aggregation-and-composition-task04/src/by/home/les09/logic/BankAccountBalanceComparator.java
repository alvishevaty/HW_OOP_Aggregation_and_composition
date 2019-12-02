package by.home.les09.logic;

import java.util.Comparator;

import by.home.les09.entity.BankAccount;

public class BankAccountBalanceComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount account1, BankAccount account2) {
		if (account1.getBalance() > account2.getBalance())
			return 1;
		else if (account1.getBalance() < account2.getBalance())
			return -1;
		else
			return 0;
	}

}

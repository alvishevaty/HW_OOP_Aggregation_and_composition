package by.home.les09.logic;

import by.home.les09.entity.BankAccount;
import by.home.les09.entity.Client;

public class BankAccountLogic {

	public int fullBalanceSum(Client client) {
		int balance = 0;

		for (BankAccount clientBalance : client.getBankAccountList()) {
			balance = balance + clientBalance.getBalance();
		}
		return balance;
	}

	public int positiveBalanceSum(Client client) {
		int balance = 0;

		for (BankAccount clientBalance : client.getBankAccountList()) {
			if (clientBalance.getBalance() > 0) {
				balance = balance + clientBalance.getBalance();
			}
		}
		return balance;
	}

	public int negativeBalanceSum(Client client) {
		int balance = 0;

		for (BankAccount clientBalance : client.getBankAccountList()) {
			if (clientBalance.getBalance() < 0) {
				balance = balance + clientBalance.getBalance();
			}
		}
		return balance;
	}

	public BankAccount lockAcount(BankAccount bankAccount) {
		if (bankAccount.getStatus().equals("lock")) {
			bankAccount.setStatus("unlock");
		} else if (bankAccount.getStatus().equals("unlock")) {
			bankAccount.setStatus("lock");
		}
		return bankAccount;
	}
}

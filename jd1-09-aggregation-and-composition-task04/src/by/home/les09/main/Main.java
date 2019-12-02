package by.home.les09.main;

import java.util.ArrayList;
import java.util.List;

import by.home.les09.entity.Bank;
import by.home.les09.entity.BankAccount;
import by.home.les09.entity.Client;
import by.home.les09.logic.BankAccountLogic;
import by.home.les09.view.BankAccountView;

public class Main {

	public static void main(String[] args) {

		/*
		 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
		 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
		 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
		 * положительный и отрицательный балансы отдельно.
		 */

		Client client1 = new Client("Pushka", "Lev");
		client1.setBankAccountList(new BankAccount(100015, 20_000, "unlock"));
		client1.setBankAccountList(new BankAccount(584684, -5_000, "unlock"));
		client1.setBankAccountList(new BankAccount(468731, 100_000, "unlock"));
		client1.setBankAccountList(new BankAccount(879564, -15_000, "unlock"));

		Client client2 = new Client("Hrusc", "Arkadi");
		client2.setBankAccountList(new BankAccount(156849, 500, "unlock"));
		client2.setBankAccountList(new BankAccount(198765, -100, "unlock"));
		client2.setBankAccountList(new BankAccount(795462, 700, "unlock"));

		Client client3 = new Client("Bogomol", "Mihail");
		client3.setBankAccountList(new BankAccount(100005, 500_000, "unlock"));
		client3.setBankAccountList(new BankAccount(200000, -100_000, "unlock"));
		client3.setBankAccountList(new BankAccount(333334, -10_000, "unlock"));
		client3.setBankAccountList(new BankAccount(489856, 15_000, "unlock"));

		Bank bank = new Bank("BPS");
		bank.setBankClientsList(client1);
		bank.setBankClientsList(client2);
		bank.setBankClientsList(client3);

		BankAccountLogic bankAccountLogic = new BankAccountLogic();
		bankAccountLogic.fullBalanceSum(client1);
		bankAccountLogic.positiveBalanceSum(client1);
		bankAccountLogic.negativeBalanceSum(client1);
		
		bankAccountLogic.fullBalanceSum(client2);
		bankAccountLogic.positiveBalanceSum(client2);
		bankAccountLogic.negativeBalanceSum(client2);
		
		bankAccountLogic.fullBalanceSum(client3);
		bankAccountLogic.positiveBalanceSum(client3);
		bankAccountLogic.negativeBalanceSum(client3);
		
		BankAccountView bankAccountView = new BankAccountView();
		bankAccountView.findAccount(bank);

	}

}

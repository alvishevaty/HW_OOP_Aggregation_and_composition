package by.home.les09.view;

import java.util.Scanner;

import by.home.les09.entity.Bank;
import by.home.les09.entity.Client;

public class BankAccountView {
	
	public String writeSurname(){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("\tWrite surname: ");
		String userSurname = scanner.next();
		return userSurname;
	}
	
	public int writeAccountNumber() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("\tWrite account number: ");
		while (scanner.hasNextInt() == false) {
			String string = scanner.next();
			System.out.print("\tWrite account number: ");
		}
		int userAccountNumber = scanner.nextInt();
		return userAccountNumber;
	}

	public void findAccount(Bank bank) {
		
		System.out.println("• Find account: ");
		String userSurname = writeSurname();
		int clientCounter = 0;
		int accountCounter = 0;
		for (int i = 0; i < bank.getBankClientsList().size(); i++) {
			Client client = bank.getBankClientsList().get(i);
			String clientSurname = bank.getBankClientsList().get(i).getSurname();
			
			if (clientSurname.equals(userSurname)) {
				
				clientCounter++;
				int userAccountNumber = writeAccountNumber();
				
				for (int j = 0; j < client.getBankAccountList().size(); j++) {
					
					if (userAccountNumber == client.getBankAccountList().get(j).getBankAccountNumber()) {
						System.out.println("\tBank account information: ");
						System.out.print("\t\tNumber: ");
						System.out.println("\t" + client.getBankAccountList().get(j).getBankAccountNumber());
						System.out.print("\t\tBalance: ");
						System.out.println("\t" + client.getBankAccountList().get(j).getBalance());
						System.out.print("\t\tStatus: ");
						System.out.println("\t" + client.getBankAccountList().get(j).getStatus());
						accountCounter++;
					}
				}
				if (accountCounter == 0) {
					System.out.println("\tYou enter incorrect account number.");
				}
			}
			
		}
		if (clientCounter == 0) {
			System.out.println("\tNote: We don't have a client with such surname.");
		}
	}
	
	public void writeSum(int balance) {
		System.out.println("Сумма на счете: " + balance);
	}
}

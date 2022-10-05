package tietorakenteet;

import java.util.Scanner;

public class UserInterface {

	DList dlist = new DList();
	
	public void menu() {
		
		boolean run = true;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int listNumber;
		
		while(run) {
			infoText();
			int input = scanner.nextInt();
			if(input >= 1 && input <= 6) {
				if(input == 1) {
					System.out.println("Insert (int i)");
					listNumber = inputInt();
					dlist.insert(listNumber);
				} else if(input == 2) {
					System.out.println("Find (int j)");
					listNumber = inputInt();
					dlist.find(listNumber);
				} else if(input == 3) {
					System.out.println("Delete (int k)");
					listNumber = inputInt();
					dlist.delete(listNumber);
				} else if(input == 4) {
					System.out.println("Print ()");
					dlist.print();
				} else if(input == 5) {
					System.out.println("PrintInv ()");
					dlist.printInv();
				} else if(input == 6) {
					run = false;
					System.out.println("Lopetettiin ohjelma painamalla 6");
				}

			} else {
				System.out.println("Anna kokonaisluku 1 ja 6 väliltä");
			}
		}
	}
	
	public void infoText() {
		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("\tKaksisuuntainen järjestetty rengaslista");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Valitse toiminpide (Syotä toiminpiteen numero esim. 1)\n");
		System.out.println("1. Insert");
		System.out.println("2. Find");
		System.out.println("3. Delete");
		System.out.println("4. Print");
		System.out.println("5. PrintInv");
		System.out.println("6. Lopeta");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
	}
	
	public int inputInt() {
		@SuppressWarnings("resource")
		Scanner scanInt = new Scanner(System.in);
		
		System.out.print("Syötä kokonaisluku: ");
		int number = scanInt.nextInt();
		
		return number;
	}
	
}

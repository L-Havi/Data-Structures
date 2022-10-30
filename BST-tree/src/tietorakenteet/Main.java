package tietorakenteet;

import java.util.Scanner;

public class Main {
	
	static BST bst = new BST();
	
	public static void main(String[] args) {
		boolean run = true;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int listNumber;
		String data;
		
		while(run) {
			infoText();
			int input = scanner.nextInt();
			if(input >= 1 && input <= 4) {
				if(input == 1) {
					System.out.println("Insert (int i)");
					listNumber = inputInt();
					data = inputString();
					bst.insert(listNumber, data);
				} else if(input == 2) {
					System.out.println("Find (int j)");
					listNumber = inputInt();
					bst.search(listNumber);
				} else if(input == 3) {
					System.out.println("Print ()");
					bst.print();
				} else if(input == 4) {
					run = false;
					System.out.println("Lopetettiin ohjelma painamalla 4");
				}

			} else {
				System.out.println("Anna kokonaisluku 1 ja 4 väliltä");
			}
		}
	}

	public static void infoText() {
		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("\tEtsintäpuu");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Valitse toiminpide (Syotä toiminpiteen numero esim. 1)\n");
		System.out.println("1. Insert");
		System.out.println("2. Find");
		System.out.println("3. Print");
		System.out.println("4. Lopeta");
		System.out.println("------------------------------------------------------------------------");
		System.out.println("");
	}
	
	public static int inputInt() {
		@SuppressWarnings("resource")
		Scanner scanInt = new Scanner(System.in);
		
		System.out.print("Syötä kokonaisluku: ");
		int number = scanInt.nextInt();
		
		return number;
	}
	
	public static String inputString() {
		@SuppressWarnings("resource")
		Scanner scanInt = new Scanner(System.in);
		
		System.out.print("Syötä teksti: ");
		String text = scanInt.nextLine();
		
		return text;
	}
	
}

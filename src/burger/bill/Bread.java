package burger.bill;

import java.util.Scanner;

public enum Bread {
	plain(0.5d),
	sesameSeed(0.6),
	potato(0.7d),
	englishMuffin(0.8d),
	brownRye(0.9d),
	empty(0d);
	private final double price;
	Bread( double price ){
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	public static Bread getChoice() {
		Bread type;
		System.out.println(" enter a type of bread");
		System.out.println(" 1. plain");
		System.out.println(" 2. sesameSeed");
		System.out.println(" 3. potato");
		System.out.println(" 4. englishMuffin");
		System.out.println(" 5. BrownRye");
		System.out.print(" choice::");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch( choice ) {
		case 1:
			type = Bread.plain;
			break;
		case 2:
			type = Bread.sesameSeed;
			break;
		case 3:
			type = Bread.potato;
			break;
		case 4:
			type = Bread.englishMuffin;
			break;
		case 5:
			type = Bread.brownRye;
			break;
		default:
			System.out.println("invalid option...");
			type = Bread.empty;
			break;
		}
		return type;
	}
}

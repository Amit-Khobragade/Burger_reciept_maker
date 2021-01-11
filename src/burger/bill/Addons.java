package burger.bill;

import java.util.Scanner;

public enum Addons {
	lettuce(0.20d), 
	tomato(0.20d), 
	carrot(0.7d),  
	onions(0.10d),
	chips(0.7d),
	cheese(0.10d),
	drinks(1d),
	empty(0.0d);
	private final double price;
	Addons(double price){
		this.price = price;
	}
	public double getPrice() {
		return this.price;
	}
	public static Addons getChoice() {
		Addons type;
		System.out.println(" enter a type of Addon");
		System.out.println(" 1. lettuce");
		System.out.println(" 2. tomato");
		System.out.println(" 3. carrot");
		System.out.println(" 4. onions");
		System.out.println(" 5. chips");
		System.out.println(" 6. cheese");
		System.out.println(" 7. drinks");
		System.out.println(" 8. empty");
		System.out.print(" choice::");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch( choice ) {
		case 1:
			type = Addons.lettuce;
			break;
		case 2:
			type = Addons.tomato;
			break;
		case 3:
			type = Addons.carrot;
			break;
		case 4:
			type = Addons.onions;
			break;
		case 5:
			type = Addons.chips;
			break;
		case 6:
			type = Addons.cheese;
			break;
		case 7:
			type = Addons.drinks;
			break;
		default:
			System.out.println("invalid option...");
		case 8:
			type = Addons.empty;
			break;
		}
		return type;
	}
}

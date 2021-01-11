package burger.bill;

import java.util.Scanner;

public enum Meat {
	chicken(1.36d),
	pork(2d), 
	beef(1.87d),
	empty(0d);
	private final double price;
	Meat( double type ){
		this.price = type;
	}
	public double getPrice() {
		return this.price;
	}
	public static Meat getChoice() {
		Meat type;
		System.out.println(" enter a type of meat");
		System.out.println(" 1. chicken");
		System.out.println(" 2. pork");
		System.out.println(" 3. beef");
		System.out.println(" 4. empty");
		System.out.print(" choice::");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch( choice ) {
		case 1:
			type = Meat.chicken;
			break;
		case 2:
			type = Meat.pork;
			break;
		case 3:
			type = Meat.beef;
			break;

		default:
			System.out.println("invalid option...");
		case 4:
			type = Meat.empty;
			break;
		}
		return type;
	}
}

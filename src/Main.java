import burger.bill.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opt = 0;		//never make its value 2 in program otherwise it will just quit
		do {
			opt = mainMenu();
			if( opt != 1 )
				continue;
			Burger b =choose();
			
			if( b == null)
				continue;
			Scanner sc = new Scanner(System.in);
			char ch = ' ';
			
			do {
				System.out.println("Do you want any addons( y/n )??");
				ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y')
					b.addItem(Addons.getChoice());
			}
			while(ch == 'y' || ch == 'Y');
			b.print();
			System.out.println("\npress enter to continue............");
			try {
				System.in.read();
			}
			catch(Exception ex) {
				ex.getStackTrace();
			}
			//System.out.println("Do you want to print reciept( y/n )??");
			//ch = sc.next().charAt(0);
			//if (ch == 'y' || ch == 'Y')
			//print method..		
		}
		while( opt != 2);
	}
	public static Burger choose() {
		System.out.println("1. Basic Burger");
		System.out.println("2. healthy Burger");
		System.out.println("3. Dulex  Burger");
		System.out.println("choose a burger:");
		Burger temp;
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if(opt >= 4 || opt <= 0) {
			System.out.println("invalid choice");
			return null;
		}
		switch( opt ) {
		case 1:
			temp = new BasicBurger( Meat.getChoice(), Bread.getChoice());
			break;
		case 2:
			temp = new HealthyBurger( Meat.getChoice(), Bread.getChoice());
			break;
		case 3:
			temp = new DulexHamburger( Meat.getChoice(), Bread.getChoice());
			break;
		default:
			System.out.println("warning default met...");
			temp = null;
		}
		return temp;
	}
	public static int mainMenu() {
		System.out.println("1. make a new burger");
		System.out.println("2. exit");
		System.out.println("choose an option:");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if( opt < 1 || opt > 2) {
			System.out.println("Invalid option");
			return -1;
		}
		else 
			return opt;
	}
}

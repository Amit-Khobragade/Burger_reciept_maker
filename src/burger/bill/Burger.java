package burger.bill;

import java.util.Arrays;
import java.util.Scanner;

public class Burger {
	public Burger(String name, int maxNumberOfAddons, Meat meatType, Bread breadType ){
		this.name = name;
		addons = new Addons[maxNumberOfAddons];
		Arrays.fill(this.addons, Addons.empty);
		this.meatType = meatType;
		this.breadType = breadType;
	}
	
	public String getName() {
		return name;
	}
	
	public void addItem( Addons type ) {
		if( this.addons.length <= position ) {
			System.out.println("Sorry no more addons availiable please empty some to continue...");
			return;
		}
		this.addons[this.position] = type;
		this.position++;
	}
	
	public void removeItem() {
		if(  this.position == 0) {
			System.out.println("Sorry no more addons availiable please add some to continue...");
			return;
		}
		int pos = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Addons:");
		for( int i = 0; i < addons.length; ++i ) 
			System.out.println(( i+1 ) + ". " + addons[i]);
		System.out.print("Enter the choice::");
		pos = sc.nextInt();
		if( pos < 0 || pos >= addons.length ) {
			System.out.println("wrong choice");
			return;
		}
		addons[pos] = addons[ addons.length -1 ];
		this.position--;
	}
	
	public double getPrice() {
		double price = 0d;
		price += this.meatType.getPrice();
		price += this.breadType.getPrice();
		for (int i = 0; i < addons.length; ++i) 
			price += this.addons[i].getPrice();
		return price;
	}
	
	public void print() {
		System.out.println("................................................");
		System.out.println( "Meat type::\t\t" + meatType + "\t\t" + meatType.getPrice() );
		System.out.println( "Bread Type::\t\t" + breadType + "\t" + breadType.getPrice() );
		System.out.println( "Addons::\n"  );
		for( Addons item : addons )
			if( item != Addons.empty )
				System.out.println( "\t\t\t" + item + "\t\t" + item.getPrice() );
		System.out.println("................................................");
		System.out.println( "Burger::\t" + name + "\t" + this.getPrice() );		
	}
	protected int position = 0;
	private String name;
	private Addons[] addons;
	private Meat meatType;
	private Bread breadType;
	
}


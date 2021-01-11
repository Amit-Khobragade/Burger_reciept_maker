package burger.bill;

public class DulexHamburger extends Burger{
	public DulexHamburger(Meat meatType, Bread breadType){
		super("healthy Burger", 6, meatType, breadType);
		super.addItem(Addons.chips);
		super.addItem(Addons.drinks);
	}
	@Override
	public  void addItem( Addons type ) {
		System.out.println("Sorry cant add addons in this burger type");
	}
	@Override
	public  void removeItem() {
		System.out.println("Sorry cant remove addons in this burger type");
	}
	
}

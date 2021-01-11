package burger.bill;

public class HealthyBurger extends Burger {
	public HealthyBurger(Meat meatType, Bread breadType){
		super("healthy Burger", 6, meatType, breadType);
	}
	@Override
	public void removeItem() {
		if( super.position < 2) {
			System.out.println("error minimum 2 items requierd");
			return;
		}
		super.removeItem();
	}
}

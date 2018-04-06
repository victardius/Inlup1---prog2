
public class Device extends Valuables {
	
	private int condition = 0;
	private int buyoutPrice = 0;
	
	public Device (String name, int condition, int buyoutPrice){
		super(name);
		this.condition = condition;
		this.buyoutPrice = buyoutPrice;
	}
	
	@Override
	public double calcValue () {
		return ((condition/10.0) * buyoutPrice);
	}
	
	@Override
	public String toString() {
		return "Device: " + getName() + " Value: " + getValue() + " Price: " + buyoutPrice + " Condition: " + condition;
	}
	
	@Override
	public void setValue () {
	}
	
}


public class Devices extends Valuables {
	
	private int condition = 0;
	private int buyoutPrice = 0;
	
	public Devices (String name, int condition, int buyoutPrice){
		super(name);
		this.condition = condition;
		this.buyoutPrice = buyoutPrice;
	}
	
	@Override
	public double calcValue () {
		return ((condition/10) * buyoutPrice);
	}
	
	@Override
	public String toString() {
		return "Device: " + getName() + " condition: + condition + " + "value: " + getValue();
	}
	
}

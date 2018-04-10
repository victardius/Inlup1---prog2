import java.text.DecimalFormat;

public class Device extends Valuables {
	DecimalFormat formatDec = new DecimalFormat("#0.00");
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
		return "Device: " + getName() + " Value: " + formatDec.format(getValue()) + " Price: " + buyoutPrice + " Condition: " + condition;
	}
	
}

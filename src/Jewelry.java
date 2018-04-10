import java.text.DecimalFormat;

public class Jewelry extends Valuables {
	DecimalFormat formatDec = new DecimalFormat("#0.00");
	private int gems = 0;
	private boolean material;

	public Jewelry (String name, int gems, boolean material){
		super(name);
		this.material = material;
		this.gems = gems;
	}
	
	@Override
	public double calcValue () {
		return ((material)? 2000 : 700) + (gems * 500);
	}

	@Override 
	public String toString() {
		return "Jewelry: " + getName() + " value: " + formatDec.format(getValue()) + " gems: " + gems + " " + ((material)? "Gold" : "Silver");
	}
	
}
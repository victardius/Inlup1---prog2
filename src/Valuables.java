import java.text.*;

public abstract class Valuables {
	
	private String name;
	DecimalFormat formatDec = new DecimalFormat("#0.00");
	
	public Valuables(String n) {
		name = n;
	}
	
	public abstract double calcValue();
	
	public String getName() {
		return name;
	}
	
	public double getValue() {
		return calcValue() * 1.25;
	}
	
	public void setValue() {
		
	}
	
	public abstract String toString();

}

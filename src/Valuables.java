
public abstract class Valuables {
	
	protected String name;
	protected double value;
	
	public abstract double calcValue();
	
	public String getName() {
		return name;
	}
	
	public double getValue() {
		return calcValue() * 1.25;
	}
	
	public abstract String toString();

}

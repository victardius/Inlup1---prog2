
public abstract class Valuables {
	
	private String name;
	private double value;
	
	public abstract double calcValue(double v);
	
	public String getName() {
		return name;
	}
	
	public double getValue() {
		return calcValue(value) * 1.25;
	}
	
	public abstract String toString();

}


public abstract class Valuables {
	
	private String name;
	
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
	
	public abstract String toString();

}

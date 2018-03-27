
public class Jewelry extends Valuables {
	
	private int gems = 0;
	private static final int SILVER = 700, GULD = 2000;
	
	public double calcValue () {
		return value + (gems * 500);
	}

	public String toString() {
		return "Smycke: " + name + " värde: " + getValue();
	}
	
}

public class Jewelry extends Valuables {
	
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
		return "Jewelry: " + getName() + " value: " + getValue() + " gems: " + gems + " " + ((material)? "Gold" : "Silver");
	}

	@Override
	public void setValue () {
	}
	
}

public class Stock extends Valuables {
	private int amount = 0;
	private double price = 0;
	
	public Stock(String name, double price, int amount){
		super(name);
		this.amount = amount;
		this.price = price;
		
	}
	
	public double calcValue () {
		return amount * price;
	}

	public String toString() {
		return "Stock: " + getName() + " " + "Stock value: " + getValue() + " " + "Share amount: " + amount + " " + "Stock price: " + price ;
	}
	
}

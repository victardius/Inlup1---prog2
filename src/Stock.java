
public class Stock extends Valuables {
	private int Amount = 0;
	private double Price = 0;
	
	public Stock(String name, double Price, int Amount){
		super(name);
		Amount = this.Amount;
		Price = this.Price;
		
	}
	
	public double calcValue () {
		return Amount * Price;
	}

	public String toString() {
		return "Stock: " + getName() + " " + "Value: " + getValue() + " " + "Share amount: " + " " + "Stock price: " + Price ;
	}
	
}

import java.text.DecimalFormat;

public class Stock extends Valuables {
	private int amount = 0;
	private double price = 0;
	DecimalFormat formatDec = new DecimalFormat("#0.00");
	public Stock(String name, double price, int amount){
		super(name);
		this.amount = amount;
		this.price = price;
		
	}
	
	@Override
	public double calcValue () {
		return amount * price;
	}

	@Override
	public String toString() {
		return "Stock: " + getName() + " " + "Stock value: " + formatDec.format(getValue()) + " " + "Share amount: " + amount + " " + "Stock price: " + price ;
	}
	
	@Override
	public void setValue () {
		price = 0;
	}
	
}

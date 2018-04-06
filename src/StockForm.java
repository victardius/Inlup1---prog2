import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class StockForm extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nameField = new JTextField(10);
	JTextField priceField = new JTextField(10);
	JTextField amountField = new JTextField(3);

	StockForm() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel row1 = new JPanel();
		row1.add(new JLabel("Name:"));
		row1.add(nameField);
		add(row1);
		JPanel row2 = new JPanel();
		row2.add(new JLabel("Price:"));
		row2.add(priceField);
		add(row2);
		JPanel row3 = new JPanel();
		row3.add(new JLabel("Amount:"));
		row3.add(amountField);
		add(row3);
	}

	public String getName() {
		return nameField.getText();
	}

	public double getPrice() {
		return Double.parseDouble(priceField.getText());
	}

	public int getAmount() {
		return Integer.parseInt(amountField.getText());
	}
}
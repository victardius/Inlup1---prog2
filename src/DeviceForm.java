import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DeviceForm extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nameField = new JTextField(10);
	JTextField conditionField = new JTextField(2);
	JTextField priceField = new JTextField(10);

	DeviceForm() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel row1 = new JPanel();
		row1.add(new JLabel("Product:"));
		row1.add(nameField);
		add(row1);
		JPanel row2 = new JPanel();
		row2.add(new JLabel("Condition:"));
		row2.add(conditionField);
		add(row2);
		JPanel row3 = new JPanel();
		row3.add(new JLabel("Price:"));
		row3.add(priceField);
		add(row3);
	}

	public String getName() {
		return nameField.getText();
	}

	public int getCondition() {
		return Integer.parseInt(conditionField.getText());
	}

	public int getPrice() {
		return Integer.parseInt(priceField.getText());
	}
}
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class JewelryForm extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField nameField = new JTextField(10);
	JTextField gemsField = new JTextField(2);
	JCheckBox materialBox = new JCheckBox("Made of gold?");

	JewelryForm() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel row1 = new JPanel();
		row1.add(new JLabel("Name:"));
		row1.add(nameField);
		add(row1);
		JPanel row2 = new JPanel();
		row2.add(new JLabel("Gems:"));
		row2.add(gemsField);
		add(row2);
		add(materialBox);
	}

	public String getName() {
		return nameField.getText();
	}

	public int getPrice() {
		return Integer.parseInt(gemsField.getText());
	}

	public boolean getMaterial() {
		return materialBox.isSelected();
	}
}
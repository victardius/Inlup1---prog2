import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIManager extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextArea display;
	JRadioButton nameRadioButton, valueRadioButton;
	private String[] valuableOptions = { "Device", "Jewelry", "Stock" };
	JComboBox<String> newValuablesDropdown = new JComboBox<String>(valuableOptions);
	private ArrayList<Valuables> valuables = new ArrayList<>();

	GUIManager() {
		display = new JTextArea();
		JScrollPane scroll = new JScrollPane(display);
		display.setEditable(false);
		add(scroll, BorderLayout.CENTER);

		JPanel sidebarRight = new JPanel();
		sidebarRight.setLayout(new BoxLayout(sidebarRight, BoxLayout.Y_AXIS));
		add(sidebarRight, BorderLayout.EAST);
		sidebarRight.add(new JLabel("Sorting by:"));
		nameRadioButton = new JRadioButton("Name", true);
		sidebarRight.add(nameRadioButton);
		valueRadioButton = new JRadioButton("Value");
		sidebarRight.add(valueRadioButton);
		ButtonGroup bg = new ButtonGroup();
		bg.add(nameRadioButton);
		bg.add(valueRadioButton);

		JPanel lowerBar = new JPanel();
		add(lowerBar, BorderLayout.SOUTH);
		JLabel newValuablesLabel = new JLabel("New:");
		lowerBar.add(newValuablesLabel);

		lowerBar.add(newValuablesDropdown);
		newValuablesDropdown.addActionListener(new InputListener());

		JButton displayOptions = new JButton("List");
		lowerBar.add(displayOptions);
		displayOptions.addActionListener(new DisplayListener());
		 JButton marketCrash = new JButton("Market crash");
		 lowerBar.add(marketCrash);
		 marketCrash.addActionListener(new CrashListener());

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 600);
		setVisible(true);
	}

	class InputListener implements ActionListener {

		public void actionPerformed(ActionEvent ave) {
			try {
				if (newValuablesDropdown.getSelectedItem().equals("Device"))
					deviceInput();
				else if (newValuablesDropdown.getSelectedItem().equals("Jewelry"))
					jewelryInput();
				else
					stockInput();

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(GUIManager.this, "Invalid input!");
			}
		}

		private void deviceInput() {

			DeviceForm f = new DeviceForm();
			int svar = JOptionPane.showConfirmDialog(GUIManager.this, f, "Add device", JOptionPane.OK_CANCEL_OPTION);

			if (svar != JOptionPane.OK_OPTION)
				return;
			String name = f.getName();
			int condition = f.getCondition();
			int price = f.getPrice();
			Device device = new Device(name, condition, price);
			valuables.add(device);

		}

		private void jewelryInput() {

			JewelryForm f = new JewelryForm();
			int svar = JOptionPane.showConfirmDialog(GUIManager.this, f, "Add jewelry", JOptionPane.OK_CANCEL_OPTION);

			if (svar != JOptionPane.OK_OPTION)
				return;
			String name = f.getName();
			int price = f.getPrice();
			boolean gold = f.getMaterial();
			Jewelry jewelry = new Jewelry(name, price, gold);
			valuables.add(jewelry);

		}

		private void stockInput() {
			StockForm f = new StockForm();
			int svar = JOptionPane.showConfirmDialog(GUIManager.this, f, "Add stock", JOptionPane.OK_CANCEL_OPTION);

			if (svar != JOptionPane.OK_OPTION)
				return;
			String name = f.getName();
			double price = f.getPrice();
			int amount = f.getAmount();

			Stock stock = new Stock(name, price, amount);
			valuables.add(stock);

		}

	}
	
	class DisplayListener implements ActionListener {
		public void actionPerformed(ActionEvent ave) {
			display.setText("");
			for (Valuables v: valuables) {
				display.append(v.toString() + "\n");
			}
		}
	}
	
	class CrashListener implements ActionListener {
		public void actionPerformed(ActionEvent ave) {
			display.setText("");
			for (Valuables v: valuables) {
				v.setValue();
			}
		}
	}

}
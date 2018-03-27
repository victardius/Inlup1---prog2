import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OM extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int value = 0;
	JLabel lab = new JLabel(" 0");
	JButton öka, minska;

	OM() {
		super("ÖkaMinska");
		setLayout(new FlowLayout());
		öka = new JButton("Öka");
		öka.addActionListener(this);
		add(öka);
		add(lab);
		minska = new JButton("Minska");
		minska.addActionListener(this);
		add(minska);
		setSize(230, 70);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ave) {
		öka(ave);
		minska(ave);
	}

	private void öka(ActionEvent ave) {
		if (ave.getSource() == öka)
			lab.setText(String.valueOf(++value));
	}

	private void minska(ActionEvent ave) {
		if (ave.getSource() == minska)
			lab.setText(String.valueOf(--value));
	}

	public static void main(String[] args) {
		new OM();
	}
}
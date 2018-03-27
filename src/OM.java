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
	JButton �ka, minska;

	OM() {
		super("�kaMinska");
		setLayout(new FlowLayout());
		�ka = new JButton("�ka");
		�ka.addActionListener(this);
		add(�ka);
		add(lab);
		minska = new JButton("Minska");
		minska.addActionListener(this);
		add(minska);
		setSize(230, 70);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ave) {
		�ka(ave);
		minska(ave);
	}

	private void �ka(ActionEvent ave) {
		if (ave.getSource() == �ka)
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
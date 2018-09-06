package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	static int nams = 0;
	static ArrayList<String> names = new ArrayList<String>();
	static String gn;

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.set();

	}

	public void set() {
		f.add(p);
		f.setVisible(true);
		p.add(b1);
		p.add(b2);
		b1.setText("View Names");
		b2.setText("Add Name");
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (b2 == e.getSource()) {
			gn = JOptionPane.showInputDialog("Add a name");
			nams++;
			names.add(gn);
		}
		String list = "";
		if (b1 == e.getSource()) {
			for (int i = 0; i < nams; i++) {
				list = list + "Guest #" + i + ":" + "  " + names.get(i)+"\n";

			}
			JOptionPane.showMessageDialog(null, list);

		}
	}
}

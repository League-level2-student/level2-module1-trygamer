package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	static int nams= 4;

public static void main(String[] args) {
	String[] sn = new String[nams];
	sn[0]=
}

public void set() {
	f.add(p);
	p.add(b1);
	p.add(b2);
	b1.setText("View Names");
	b2.setText("Add Name");
	b1.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(b2==e.getSource()) {
		JOptionPane.showMessageDialog(null, "Add a name");
		nams++;
	}
}
}

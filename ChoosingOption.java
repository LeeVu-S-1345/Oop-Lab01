package lab01;

import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, 
				"Do you want to change the first ticket?", 
				null, JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, 
				"You're chosen: " + (option==JOptionPane.YES_OPTION?"YES":"NO"));
		System.exit(0);
	}
}

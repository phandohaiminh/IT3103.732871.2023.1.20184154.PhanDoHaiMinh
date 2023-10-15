// Ho ten: Phan Do Hai Minh
// MSSV  : 20184154
// Bai 6.1
// Write, compile and run the ChoosingOption program

import javax.swing.JOptionPane;
public class ChoosingOption {
public static void main(String[] args) {
	int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
	JOptionPane.showMessageDialog(null, "You've choosen :"+ (option==JOptionPane.YES_NO_OPTION?"yes":"no"));
	System.exit(0);
	}
}

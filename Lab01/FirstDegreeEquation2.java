// Ho ten: Phan Do Hai Minh
// MSSV  : 20184154
// Bai 2.2.6.2
// The system of first-degree equations (linear system) with two variables

import javax.swing.*;

public class FirstDegreeEquation2 {
  public static void main(String[] args) {
    String strA1, strB1, strC1, strA2, strB2, strC2;
    String strNotification = "Enter first degree equation 2 variables";

    JOptionPane.showMessageDialog(null, strNotification, "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);

    strA1 = JOptionPane.showInputDialog(null, "Please input a1: ", "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);
    strB1 = JOptionPane.showInputDialog(null, "Please input b1: ", "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);
    strC1 = JOptionPane.showInputDialog(null, "Please input c1: ", "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);
    strA2 = JOptionPane.showInputDialog(null, "Please input a2: ", "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);
    strB2 = JOptionPane.showInputDialog(null, "Please input b2: ", "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);
    strC2 = JOptionPane.showInputDialog(null, "Please input c2: ", "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);

    double a1 = Double.parseDouble(strA1);
    double b1 = Double.parseDouble(strB1);
    double c1 = Double.parseDouble(strC1);
    double a2 = Double.parseDouble(strA2);
    double b2 = Double.parseDouble(strB2);
    double c2 = Double.parseDouble(strC2);

    double D = a1*b2 - a2*b1;
    double D1 = c1*b2 - c2*b1;
    double D2 = a1*c2 - a2*c1;

    if (D != 0) {
      strNotification = "x = " + Double.toString(D1/D);
      strNotification +="\ny = " + Double.toString(D2/D);
    } else {
      if (D1 == 0 && D2 == 0) {
        strNotification = "The equation has infinite solution";
      } else {
        strNotification = "The equation has no solution";
      }
    }

    JOptionPane.showMessageDialog(null, strNotification, "Solve first degree equation 2 variables", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}

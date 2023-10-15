// Ho ten: Phan Do Hai Minh
// MSSV  : 20184154
// Bai 2.2.6.2
// The second-degree equation with one variable

import javax.swing.*;

public class SecondDegreeEquation {
  public static void main(String[] args) {
    String strA, strB, strC;
    String strNotification = "Enter second degree equation ax^2 +bx + c = 0";

    JOptionPane.showMessageDialog(null, strNotification, "Solve second degree equation ax^2 +bx + c = 0", JOptionPane.INFORMATION_MESSAGE);

    strA = JOptionPane.showInputDialog(null, "Please input a: ", "Solve second degree equation ax^2 +bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
    strB = JOptionPane.showInputDialog(null, "Please input b: ", "Solve second degree equation ax^2 +bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
    strC = JOptionPane.showInputDialog(null, "Please input c: ", "Solve second degree equation ax^2 +bx + c = 0", JOptionPane.INFORMATION_MESSAGE);

    double a = Double.parseDouble(strA);
    double b = Double.parseDouble(strB);
    double c = Double.parseDouble(strC);

    double delta = b*b - 4*a*c;

    if (delta < 0) {
      strNotification = "The equation has no solution";
    } else if (delta == 0){
      strNotification = "x = " + Double.toString(-b/(2*a));
    } else {
      strNotification = "x1 = " + Double.toString((-b + Math.sqrt(delta))/ (2*a));
      strNotification += "\nx2 = " + Double.toString((-b - Math.sqrt(delta))/ (2*a));
    }

    JOptionPane.showMessageDialog(null, strNotification, "Solve second degree equation ax^2 +bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
  }
}

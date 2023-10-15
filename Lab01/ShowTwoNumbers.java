// Ho ten: Phan Do Hai Minh
// MSSV  : 20184154
// Bai 2.2.5
// Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered ";
        
        // Enter the first number
        strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number: ", "Enter the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        
        //Enter second number
        strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number: ", "Enter the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;
        
        // Show two number
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        // Sum
        JOptionPane.showMessageDialog(null, num1 + num2 , "Sum of two numbers:", JOptionPane.INFORMATION_MESSAGE);
        // Difference
        JOptionPane.showMessageDialog(null, num1 - num2 , "Difference of two numbers:", JOptionPane.INFORMATION_MESSAGE);
        // Product
        JOptionPane.showMessageDialog(null, num1 * num2 , "Product of two numbers:", JOptionPane.INFORMATION_MESSAGE);
        // Quotient
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "The divisor (the second number) cannot be zero" , "Error:", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, num1 / num2 , "Quotient of two numbers:", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}

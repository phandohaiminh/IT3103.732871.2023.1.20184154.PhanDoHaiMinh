// Ho ten: Phan Do Hai Minh
// MSSV  : 20184154
// Bai 6.2
// Write a program for input/output from keyboard

import java.util.Scanner;

public class InputFromKeyboard {
public static void main(String args[]) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What's your name?");
	String strName= keyboard.nextLine();
	System.out.println("How old are you?");
	int iAge = keyboard.nextInt();
	System.out.println("How tall are you (m)?");
	double dHeight = keyboard.nextDouble();
	System.out.println("Mrs/Ms. "+ strName + ", " + iAge + " year old. " + "Your height is "+ dHeight+ "(m).");
	System.exit(0);
	}
}

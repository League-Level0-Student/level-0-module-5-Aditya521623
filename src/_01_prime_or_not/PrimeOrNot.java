package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
String number =JOptionPane.showInputDialog("give me an number, I will then check if it is prime");		

int num = Integer.parseInt(number);

for(int i =2 ; i <num;i++) {
	
	if(num%i==0) {
		JOptionPane.showMessageDialog(null, "not prime");
		System.exit(0);
	}

	
	
}

JOptionPane.showMessageDialog(null, "prime");




	}

}

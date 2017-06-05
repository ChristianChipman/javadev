import java.util.Scanner;

public class A2dot1 {
	public static void main(String[] args) {
		Scanner billy = new Scanner(System.in);
		
		System.out.println("Celsius to Fahrenheit Converter");

		System.out.print("Enter a degree in celsius: ");
		double Celsius = billy.nextDouble();
 		
		double Fahrenheit = (9.0 / 5.0) * Celsius + 32;
		System.out.println("Celsius, which is set at " + Celsius + ", is converted to " + Fahrenheit + " degrees Fahrenheit.");
	}
}
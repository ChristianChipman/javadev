import java.util.Scanner;

public class A2dot5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Gratuity and Total Calculator");
		
		System.out.print("Subtotal amount: $ ");
		double subtotal = input.nextDouble();

		System.out.print("Gratuity percentage: % ");
		double gratuityPercentage = input.nextDouble() / 100;
		
		double gratuityTotal = subtotal * gratuityPercentage;
		System.out.println("Gratuity total: " + "$ " + gratuityTotal);
		double total = gratuityTotal + subtotal;
		System.out.println("Your total: " + "$ " + total);
	}
}
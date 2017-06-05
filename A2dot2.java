import java.util.Scanner;

public class A2dot2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Compute the Volume of a Cylinder");
		double area, radius, length, volume;
		
		System.out.print("Enter in the radius of the cylinder: ");
		radius = input.nextDouble();
		area = radius * radius * Math.PI;
		System.out.println("Area = " + area);
		
		System.out.print("Enter in the length of the cylinder: ");
		length = input.nextDouble();
		volume = area * length;
		System.out.println("The volume of the container: " + volume);
	}
}
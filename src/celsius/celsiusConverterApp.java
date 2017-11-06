package celsius;

import java.text.NumberFormat;
import java.util.Scanner;

//This is a Celsius converter. Enter a degree value in Celsius and it will tell you the equivalent in Fahrenheit.

public class celsiusConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter Application!");
		Scanner sc = new Scanner(System.in);
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter degrees in Celsius: ");
		double degC = sc.nextDouble();
		double degF= degC*1.8 + 32;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String roundedDegF = number.format(degF);
		
		System.out.println("Degrees in Fahrenheit= " + roundedDegF);
		
		System.out.print("Continue? (y/n):");
        choice = sc.next();
        System.out.println();
		
	}
	sc.close();
	System.out.println("Bye!");

	}

}
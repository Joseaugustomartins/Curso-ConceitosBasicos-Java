package URF;
import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double r = sc.nextDouble();
		
		double volume = (4/3.0) * pi * Math.pow(r, 3);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}

}

package URF;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, ConsumoM;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		ConsumoM = X / Y;
		
		System.out.printf("%.3f km/l%n", ConsumoM);
		
		
		sc.close();
	}

}

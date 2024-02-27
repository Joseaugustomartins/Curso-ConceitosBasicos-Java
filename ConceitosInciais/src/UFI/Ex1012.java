package URF;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		double pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTr = A * C /2;
		double CirculoRa = pi * Math.pow(C, 2);
		double areatrap = (A + B) * C/2;
		double areaQu = Math.pow(B, 2);
		double aTrian = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTr);
		System.out.printf("CIRCULO: %.3f%n", CirculoRa);
		System.out.printf("TRAPEZIO: %.3f%n", areatrap);
		System.out.printf("QUADRADO: %.3f%n", areaQu);
		System.out.printf("RETANGULO: %.3f%n", aTrian);
		
		sc.close();
	}

}

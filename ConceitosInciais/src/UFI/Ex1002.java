package URF;

import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double raio;
		double n = 3.14159; 
		
		raio = sc.nextDouble();
		
		double area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}

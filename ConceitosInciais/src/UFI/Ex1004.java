package URF;

import java.util.Scanner;

public class Ex1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		int PROD = a * b;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}

}

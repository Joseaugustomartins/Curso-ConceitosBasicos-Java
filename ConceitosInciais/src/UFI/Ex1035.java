package URF;

import java.util.Scanner;

public class Ex1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		if(B > C) {
			if(D > A) {
				if((C +D) > (A + B) ) {
					{
						if(C > 0 && D > 0) {
							if(A % 2 == 0) {
								System.out.println("Valores aceitos");
							}
						}
					}
				}
			}
		}else {
			System.out.println("Valores não aceito");
		}
		
		sc.close();
	}

}

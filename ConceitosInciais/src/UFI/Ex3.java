import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		int idade, idade2;
		
		nome1 = sc.next();
		idade = sc.nextInt();
		nome2 = sc.next();
		idade2 = sc.nextInt();
		
		double media = (double) (idade + idade2) / 2;
		
		System.out.printf("A idade média de %s é de %s é de %.1f anos", nome1, nome2, media);
		
		sc.close();
	}

}

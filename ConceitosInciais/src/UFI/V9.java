package URF;

import java.util.Locale;
import java.util.Scanner;

public class V9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		double[] compra = new double[N];
		double[] venda = new double[N];
		
		for(int i=0; i<N; i++) {
			nomes[i] = sc.next();
			compra[i] = sc.nextDouble();
			venda[i] = sc.nextDouble();
		}
		
		int contAbaixoDE10 = 0;
		int contEntre10E20 = 0;
		int contAcimaDe20 = 0;
		for(int i=0; i<N; i++) {
			
			double lucro = venda[i] - compra[i];
			
			double porcentagemDeLucro = lucro / compra[i] * 100.0;
			
			if(porcentagemDeLucro < 10.0) {
				contAbaixoDE10++;
			}else if(porcentagemDeLucro <= 20.0) {
				contEntre10E20++;
			}else {
				contAcimaDe20++;
			}
		}
		System.out.println("Lucro abaico de 10%: " + contAbaixoDE10);
		System.out.println("Lucro entre 10% e 20%: " + contEntre10E20);
		System.out.println("Lucro acima de 20%: " + contAcimaDe20);
		
		double totalCompra= 0.0;
		double totalVenda =0.0;
		for(int i=0; i<N; i++) {
			totalCompra += compra[i];
			totalVenda += venda[i];
		}
		
		double totalLucro = totalVenda - totalCompra;
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", totalLucro);
		
		sc.close();
	}

}

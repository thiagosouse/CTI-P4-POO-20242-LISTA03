package br.edu.util;

public class Funcao_seis {
	public static void multiplicacao(int n) {
		int i, j;
		
		for (i=1;i<=n;i++) {
			
			for (j=1;j<=i;j++) {
				
				System.out.print(i*j+ "  ");
			}
			System.out.println();
		}
	}
}
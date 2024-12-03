package br.edu.principal;

import java.util.Scanner;

import br.edu.util.Funcao_seis;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("número: ");
			num = sc.nextInt();
		} while (num < 1 | num > 9);
		
		Funcao_seis.multiplicacao(num);
		sc.close();
	}

}
package br.edu.principal;

import java.util.Scanner;

import br.edu.util.Funcao_dez;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, s;
		
		System.out.print("número: ");
		num = sc.nextDouble();		
		s = Funcao_dez.sequencia(num);
		System.out.print("\nsequencia: "+s);
		sc.close();
	}

}
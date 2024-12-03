package br.edu.util;

public class Funcao_cinco {

	public static double reajuste(double antigo, double atual) {
		double result;
		
		result = (100*atual - 100*antigo)/antigo;
		return result;
		
	}
}
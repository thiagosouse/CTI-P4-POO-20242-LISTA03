package br.edu.util;

public class Funcao_dois {
	public static int entre(int x, int y) {
	int i;
	int result = 0;
	for (i=x+1; i<y; i++) {
		result += i; 
	}
	return result;
	}
}
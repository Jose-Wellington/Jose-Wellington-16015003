package lista01.questões;

import java.util.Scanner;

public class Questão_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double numero;
		double quadrado;
		
		System.out.println("Informe o numero: ");
		numero = entrada.nextDouble();
		
		quadrado = Math.pow(numero, 2);
				
		System.out.println("O numero é: " + numero);
		System.out.println("O quadrado do numero é: " + quadrado);
		entrada.close();
		
		
	}
	}

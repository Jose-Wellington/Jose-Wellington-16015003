package lista01.quest�es;

import java.util.Scanner;

public class Quest�o_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double numero;
		double quadrado;
		
		System.out.println("Informe o numero: ");
		numero = entrada.nextDouble();
		
		quadrado = Math.pow(numero, 2);
				
		System.out.println("O numero �: " + numero);
		System.out.println("O quadrado do numero �: " + quadrado);
		entrada.close();
		
		
	}
	}

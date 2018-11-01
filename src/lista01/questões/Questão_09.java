package lista01.questões;

import java.util.Scanner;

public class Questão_09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int num1;
		int num2;
		double re1;
		double produto;
		double soma;
		double cubo;
		
		System.out.println("Informe o primeiro numero inteiro: ");
		num1 = entrada.nextInt();
		
		System.out.println("Informe o segundo numero inteito: ");
		num2 = entrada.nextInt();
		
		System.out.println("Informe o primeiro numero real: ");
		re1 = entrada.nextDouble();
		
		produto = (2*num1)*(num2/2);
		soma = 3* num1+re1;
		cubo = Math.pow(re1, 3);
		
		System.out.println("O produto é: " + produto);
		System.out.println("A soma é: " + soma);
		System.out.println("O cubo é: " + cubo);
	
		entrada.close();
		
		
	}
	}
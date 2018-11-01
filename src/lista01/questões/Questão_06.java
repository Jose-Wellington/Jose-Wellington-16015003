package lista01.questões;

import java.util.Scanner;

public class Questão_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double saldo;
		double reajuste;
		
		System.out.println("Informe o seu saldo da caderneta de poupança: ");
		saldo = entrada.nextDouble();
		
		reajuste = saldo + saldo*3/100;
				
		System.out.println("O seu saldo reajustado a 3% é: " + reajuste);
		entrada.close();
		
		
	}
	}
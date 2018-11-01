package lista01.questões;

import java.util.Scanner;

public class Questão_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double altura;
		double peso;
		
		System.out.println("Informe a altura da pessoa: ");
		altura = entrada.nextDouble();
		
		peso = (72.7*altura)-58;
				
		System.out.println("O seu peso ideal é : " + peso + "Kg");
		entrada.close();
		
		
	}
	}
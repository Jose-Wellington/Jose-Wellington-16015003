package lista01.quest�es;

import java.util.Scanner;

public class Quest�o_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double altura;
		double peso;
		
		System.out.println("Informe a altura da pessoa: ");
		altura = entrada.nextDouble();
		
		peso = (72.7*altura)-58;
				
		System.out.println("O seu peso ideal � : " + peso + "Kg");
		entrada.close();
		
		
	}
	}
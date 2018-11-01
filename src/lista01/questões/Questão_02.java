package lista01.questões;

import java.util.Scanner;

public class Questão_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double divisor;
		double dividendo;
		double quociente;
		double resto;
		
		System.out.println("Informe o divisor: ");
		divisor = entrada.nextDouble();
		
		System.out.println("Informe o dividendo: ");
		dividendo = entrada.nextDouble();
		
		quociente = dividendo/divisor;
		resto = dividendo%divisor;
				
		System.out.println("O divisor é: " + divisor);
		System.out.println("O dividendo é: " + dividendo);
		System.out.println("O quociente é: " + quociente);
		System.out.println("O resto é: " + resto);
		entrada.close();
		
		
	}
	}

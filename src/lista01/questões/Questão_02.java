package lista01.quest�es;

import java.util.Scanner;

public class Quest�o_02 {

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
				
		System.out.println("O divisor �: " + divisor);
		System.out.println("O dividendo �: " + dividendo);
		System.out.println("O quociente �: " + quociente);
		System.out.println("O resto �: " + resto);
		entrada.close();
		
		
	}
	}

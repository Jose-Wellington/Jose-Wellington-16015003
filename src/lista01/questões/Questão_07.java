package lista01.quest�es;

import java.util.Scanner;

public class Quest�o_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double m;
		double cm;
		
		System.out.println("Informe a distancia em metros: ");
		m = entrada.nextDouble();
		
		cm = m*100;
				
		System.out.println("A sua distancia em cent�metros �: " + cm);
		entrada.close();
		
		
	}
	}
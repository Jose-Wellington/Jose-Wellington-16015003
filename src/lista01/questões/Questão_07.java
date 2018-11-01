package lista01.questões;

import java.util.Scanner;

public class Questão_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double m;
		double cm;
		
		System.out.println("Informe a distancia em metros: ");
		m = entrada.nextDouble();
		
		cm = m*100;
				
		System.out.println("A sua distancia em centímetros é: " + cm);
		entrada.close();
		
		
	}
	}
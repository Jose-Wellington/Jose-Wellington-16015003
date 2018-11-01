package lista01.questões;

import java.util.Scanner;

public class Questão_05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double fahren;
		double celcius;
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		fahren = entrada.nextDouble();
		
		celcius = 5*(fahren - 32)/9;
				
		System.out.println("A temperatura em graus Celcius é : " + celcius + "°");
		entrada.close();
		
		
	}
	}
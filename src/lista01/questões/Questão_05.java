package lista01.quest�es;

import java.util.Scanner;

public class Quest�o_05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double fahren;
		double celcius;
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		fahren = entrada.nextDouble();
		
		celcius = 5*(fahren - 32)/9;
				
		System.out.println("A temperatura em graus Celcius � : " + celcius + "�");
		entrada.close();
		
		
	}
	}
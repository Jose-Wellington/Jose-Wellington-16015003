package lista01.questões;

import java.util.Scanner;

public class Questão_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int seg1;
		int seg2;
		int horas;
		int minutos;
		
		System.out.println("Informe o tempo de duração em segundos: ");
		seg1 = entrada.nextInt();
		
		seg2 = seg1%60;
		seg1/=60;
		minutos = seg1%60;
		seg1/=60;
		horas = seg1%24;
		
		System.out.println("O tempo decorrido será: " + horas + ":" + minutos + ":" + seg2);
	
		entrada.close();
		
		
	}
	}
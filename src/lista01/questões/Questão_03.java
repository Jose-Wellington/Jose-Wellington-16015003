package lista01.quest�es;

import java.util.Scanner;

public class Quest�o_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double ganha;
		int horas;
		double salario;
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		ganha = entrada.nextDouble();
		
		System.out.println("Informe quantas horas trabalha no m�s: ");
		horas = entrada.nextInt();
		
		salario = ganha*horas;
				
		System.out.println("O seu salario mensal �: " + salario);
		entrada.close();
		
		
	}
	}

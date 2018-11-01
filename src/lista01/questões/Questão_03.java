package lista01.questões;

import java.util.Scanner;

public class Questão_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double ganha;
		int horas;
		double salario;
		
		System.out.println("Informe quanto você ganha por hora: ");
		ganha = entrada.nextDouble();
		
		System.out.println("Informe quantas horas trabalha no mês: ");
		horas = entrada.nextInt();
		
		salario = ganha*horas;
				
		System.out.println("O seu salario mensal é: " + salario);
		entrada.close();
		
		
	}
	}

package lista01.questões;

import java.util.Scanner;

public class Questão_01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.println("Informe seu nome: ");
		nome = entrada.next();
		
		System.out.println("Informe sua idade: ");
		idade = entrada.nextInt();
				
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade + " anos");
		entrada.close();
		
		
	}
	}

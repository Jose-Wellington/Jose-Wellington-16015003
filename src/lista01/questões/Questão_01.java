package lista01.quest�es;

import java.util.Scanner;

public class Quest�o_01 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.println("Informe seu nome: ");
		nome = entrada.next();
		
		System.out.println("Informe sua idade: ");
		idade = entrada.nextInt();
				
		System.out.println("Seu nome �: " + nome);
		System.out.println("Sua idade �: " + idade + " anos");
		entrada.close();
		
		
	}
	}

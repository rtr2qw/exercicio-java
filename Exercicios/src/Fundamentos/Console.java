package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		/*
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("Dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d"
				,1,2,3,4,5,6);
		System.out.printf("nome: %s%n", "joao");
		*/
		
		Scanner entrada = new Scanner (System.in);
		
			System.out.println("Digite seu nome:  ");
			String nome = entrada.nextLine();
			System.out.println("Qual sua idade: ");
			int idade = entrada.nextInt();
			
			System.out.println("\n Seja bem vindo: "+
			nome + "\nVoce ainda tem: " + idade + "? ");
		
		entrada.close();
		
	
		
		
		
			
		
	}

}

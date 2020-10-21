package dia01;

import java.util.Scanner;
/*
 * Dia 1 - Crie um programa que efetue a leitura de um nome 
 * e exiba a mensagem “olá nome informado“.
 */
public class ApresentaNome {

	static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Qual seu nome? ");
		String nome = input.next();
		
		System.out.println("Olá " + nome + "! Seja Bem Vindo!!");

	}

}

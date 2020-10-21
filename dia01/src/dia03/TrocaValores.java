package dia03;

import java.util.Scanner;

/*
 *Dia 3 - Crie um programa que troque os valores que estão 
 *armazenados nas variáveis nome1 e nome2. 
 *A variável nome1 armazenara o valor “mestre do universo”. 
 *A variável nome2 receberá um valor informado pelo usuário. 
 *Altere os valores das variáveis e exiba a soma da variável 
 *nome1 com o valor da variável nome2.
 */

public class TrocaValores {

	public static void main(String[] args) {
		
		String nome1 = "mestre do universo";
		String nome2;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira aqui como devo te chamar? ");
		nome2 = entrada.next();
		
		System.out.println(nome1 + " " + nome2);
		System.out.println("Seja bem vindo " );
		
	}

}

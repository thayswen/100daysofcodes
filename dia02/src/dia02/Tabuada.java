package dia02;

import java.util.Scanner;

/*
 * Dia 2 - Crie um programa que exiba a tabuada de um número informado pelo usuário.
 */

public class Tabuada {

	public static void main(String[] args) {
		int i = 0;
		int num1;
		Scanner input = new Scanner(System.in);
		System.out.println("Você quer exibir a tabuada de qual número? ");
		num1 = input.nextInt();
       
		System.out.println("------- Tabuada do " + num1 + " -------");
		
		
        while(i <= 10)
        {
            int tabuada = num1 * i;
            System.out.println(tabuada);   
            i++;
        }
		
		
	}

}

package exercicios.lacos.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ArrayList1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba dez números aleatórios na linha de comando e
		 * coloque-os em um ArrayList de forma desordenada, em seguida crie um segundo
		 * ArrayList que será populado com os valores do primeiro de forma ordenada.
		 * Mostre na tela os valores dos dois arrays.
		 */
	 
		int numeros= 0;
		Random random = new Random();
	   List<String> numeros1 = new ArrayList<String>();
		//numeros1.add(numeros);
	   
		for (int i = 0; i <= numeros ; i++) {
			
			System.out.println(random.nextInt(9));
		}		
		
		
		
		
	}
}

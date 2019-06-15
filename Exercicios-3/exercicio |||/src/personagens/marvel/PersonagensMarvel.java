package personagens.marvel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
2) Faça um programa que receba do usuário o nome de personagens da Marvel até que o nome Homem de Ferro seja lido.
   Todos devem ser inseridos em um ArrayList e depois exibidos na tela um abaixo do outro.
   Adapte o exercício anterior para que o mesmo, após receber um nome, exiba as informações
   na tela e apresente um menu onde o usuário possa escolher entre as seguintes operações:

   -Digite um nome de personagem para verificar se o mesmo já está cadastrado.
   -Digite o nome do personagem que deseja retirar da lista.
   -Digite o nome do personagem que deseja alterar o nome. 

*/
public class PersonagensMarvel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		List<String> listaDePersonagens = new ArrayList<String>();

		String nomePersonagem = "";

		while (!nomePersonagem.equalsIgnoreCase("Homem de Ferro")) {

			System.out.println("Digite o nome do personagem: ");
			nomePersonagem = entrada.nextLine();

			listaDePersonagens.add(nomePersonagem);

			System.out.println("O personagem adicionada na lista foi: " + nomePersonagem);

		}

		System.out.println("Os personagens da lista são: ");
		for (String string : listaDePersonagens) {
			System.out.println(string);
		}

		entrada.close();
		
		
		
	}
}

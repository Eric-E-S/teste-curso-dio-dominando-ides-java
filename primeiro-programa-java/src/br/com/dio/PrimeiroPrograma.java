package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();

		System.out.println(gato);
		System.out.println(livros);

		/*
		 * System.out.println("tests"); gato.sMensagem();
		 */

		/*
		 * int iValorA; int iValorB;
		 * 
		 * iValorA = 2; iValorB = 3;
		 * 
		 * System.out.println(iValorA); System.out.println(iValorB);
		 * System.out.println("Hello World! " + (iValorA + iValorB));
		 */

		/*
		 * System.out.println("Kelly..."); System.out.println("Maria...");
		 * System.out.println("baixinha..."); System.out.println("azeda...");
		 * System.out.println(":) kkk");
		 */
	}
}

class Livros {
	private String nome;
	private String npag;
}
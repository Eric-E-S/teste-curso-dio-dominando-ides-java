package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int a, b;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();

		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();

		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);

		System.out.println("");
		System.out.println("soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("multiplicacao: " + multiplicacao);
		System.out.println("divisao: " + divisao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static double divisao(int a, int b) {
		// https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
		/*
		 * https://www.guj.com.br/t/return-double-apenas-com-o-valor-inteiro/76298
		 * 
		 * https://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-
		 * places
		 */
		double dResultado;
		dResultado = (double) a / b;
		return dResultado;
		// return (double) a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}

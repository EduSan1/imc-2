package main;

import java.util.Scanner;

import calculosDeImc.CalcularImc;

public class Main {

	public static void main(String[] args) {

		CalcularImc calcular = new CalcularImc();
		System.out.println("fala nome:");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.next();
		System.out.println("Okay " + nome + ", agora me informe sua altura:");
		calcular.altura = leitor.nextDouble();
		System.out.println("peso:");
		calcular.peso = leitor.nextDouble();
		System.out.println("sua altura é :" + calcular.altura + "");
		System.out.println("seu peso é :" + calcular.peso + "");
		leitor.close();

		calcular.calculoImc();

	}

}

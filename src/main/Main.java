package main;

import java.util.Scanner;

import calculosDeImc.CalcularImc;

public class Main {

	public static void main(String[] args) {
		

		CalcularImc calcular = new CalcularImc();
		System.out.println("Olá! Eu sou o Jorginho , e hoje vou te ajudar a descobrir o seu imc");
		System.out.print("Antes de começarmos, me diga seu nome:");
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.next();
		System.out.print("Okay " + nome + ", agora me informe sua altura:");
		calcular.altura = leitor.nextDouble();
		System.out.print("E qual o seu peso?:");
		calcular.peso = leitor.nextDouble();
		System.out.println("sua altura é :" + calcular.altura + "");
		System.out.println("seu peso é :" + calcular.peso + "");
		leitor.close();

		calcular.calculoImc();

	}

}

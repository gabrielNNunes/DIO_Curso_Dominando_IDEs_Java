package model_DIO;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada;
		double X=0.0,Y=0.0,resultado=0.0;
		
		System.out.println("Bem vindo!\nDigite seu calculo: (X + Y)");
		
		entrada = sc.nextLine();
		String vetorEntrada[] = entrada.split(" ");
		X = Double.parseDouble(vetorEntrada[0]);
		Y = Double.parseDouble(vetorEntrada[2]);
		
		
		switch (vetorEntrada[1]) {
		case "+":
			resultado = soma(X,Y);
			break;
		case "-":
			resultado = subtracao(X, Y);
			break;
		case "/":
			resultado = divisao(X, Y);
			break;
		case "*":
			resultado = multiplicacao(X, Y);
			break;		
		}		
		
		System.out.println("Resultado: "+resultado);
				
		sc.close();
	}

	private static double soma(double a, double b) {
		return a+b;				
	}
	private static double subtracao(double a, double b) {
		return a-b;				
	}
	private static double divisao(double a, double b) {
		return a/b;				
	}
	private static double multiplicacao(double a, double b) {
		return a*b;				
	}

}

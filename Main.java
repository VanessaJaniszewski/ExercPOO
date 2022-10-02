package br.com.fuctura.calculadora;

import java.util.Scanner;

import br.com.fuctura.calculadora.entidades.Numeros;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Integer number1;
	Integer number2;
	String operation;
	
	while(true) {
	System.out.println("Primeiro número:");
	number1 = scanner.nextInt();

	System.out.println("[mais, menos, vezes, dividir] Operação: ");
	operation = scanner.next();

	System.out.println("Segundo número:");
	number2 = scanner.nextInt();
	
	Numeros n = new Numeros(number1, operation, number2);
	
	
	
}
}}

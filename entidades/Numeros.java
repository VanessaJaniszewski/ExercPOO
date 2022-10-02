package br.com.fuctura.calculadora.entidades;

import java.io.IOException;

public class Numeros {
	
	private Integer numero1;
	private Integer numero2;
	private String operacao;
	
	
	public Numeros(Integer numero1, String operacao, Integer numero2) {
		this.numero1 = numero1;
		this.operacao = operacao;
		this.numero2 = numero2;
		Calcular(numero1,operacao, numero2);
	}
	
	
	
	
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public Integer getNumero1() {
		return numero1;
	}
	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}
	public Integer getNumero2() {
		return numero2;
	}
	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}
	
	
	public static void Calcular(Integer num1, String oper, Integer num2) {
		Integer calcular=0;
	
		if(oper.equals("mais")) {
		calcular = num1+num2;
		}if(oper.equals("menos")) {
			calcular = num1-num2;
		}if(oper.equals("vezes")) {
			calcular = num1*num2;
		}if(oper.equals("dividido")) {
			calcular = num1/num2;}
		System.out.println("Resultado: "+calcular);

	}
		
	}



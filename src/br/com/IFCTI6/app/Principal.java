package br.com.IFCTI6.app;

import java.util.Scanner;

import br.com.IFCTI6.bo.Calculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Calculo obj = new Calculo();
		
		// Input
		System.out.println("Informe o numero:");
		int n1 = leia.nextInt();
		
		// Passando valor do atributo n1 para o metodo setN1
		obj.setN1(n1);
		
		obj.Calculo();
		
		
		
		
	}

}

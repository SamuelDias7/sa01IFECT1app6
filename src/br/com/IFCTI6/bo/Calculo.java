package br.com.IFCTI6.bo;

public class Calculo {
	private int n1;
	
	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}
	
	public void Calculo() {
		this.n1++;
		System.out.println("Numero sucessor:" + n1);
		
		this.n1-=2;
		System.out.println("Numero antecessor" + n1);
		
	}

}

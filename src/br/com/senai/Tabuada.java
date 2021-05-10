package br.com.senai;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in); 
		System.out.print("Informe o valor: ");
		int valor = tec.nextInt();
		
	int multiplicador = -1;
		 while (multiplicador < 10) {
	            multiplicador = multiplicador + 1;
	            System.out.println(valor +  " x "+ multiplicador+ " = " +valor*multiplicador);
		 }
		
		
		
		
	}

}

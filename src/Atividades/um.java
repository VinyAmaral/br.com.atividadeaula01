package Atividades;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;

public class um {
	
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, totaldedias, tda, tdm;
		
		System.out.println("Quantos anos você tem?");
		anos= ler.nextInt();
		
		System.out.println("E quantos meses? ");
		meses=ler.nextInt();
		
		System.out.println("E quantos dias?");
		dias=ler.nextInt();
		
		tda= anos*365;
		tdm=meses*30;
		totaldedias= tda + tdm + dias;
		
		
		System.out.println("Sua idade em dias é de: " + totaldedias);
		
		
		
	}

}

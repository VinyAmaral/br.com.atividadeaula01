package Atividades;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/

import java.util.Scanner;

public class dois {
	
	public static void main(String[] args){
		
		Scanner ler = new Scanner(System.in);
		
		int meses, anos, totaldedias, resto, resto2;
		
		System.out.println("Digite sua idade em dias: ");
		totaldedias=ler.nextInt();
		
		anos= totaldedias/365;
		resto= totaldedias%365;
		meses= resto/30;
		resto2= resto%30;
		
		System.out.println("\n------------------------------------------");
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + resto2 + " dias" );
		
	}

}

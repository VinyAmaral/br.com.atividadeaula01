package Atividades;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int ts, horas, min, rest, rest2;
		
		System.out.println("Digite o tempo de duração do evento: ");
		ts=ler.nextInt();
		
		horas = ts/3600;
		rest = ts%3600;
		min = rest/60;
		rest2 = rest%60;
		
		System.out.println("\n---------------------------------");
		System.out.println("O evento teve a duração de: \n");
		System.out.println(horas + " horas\n" + min + " minutos\n" + rest2 + " segundos");
		System.out.println("\nParabéns pelo evento! =)");
		
		
	}
	
}

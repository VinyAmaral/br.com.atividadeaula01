package Atividades;

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

import java.util.Scanner;

public class quatro {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, p1, p2, p3, mp;
		
		System.out.println("Nota1: ");
		n1=ler.nextInt();
		
		System.out.println("Peso 1: ");
		p1=ler.nextInt();
		
		System.out.println("Nota2: ");
		n2=ler.nextInt();
		
		System.out.println("Peso 2: ");
		p2=ler.nextInt();
		
		System.out.println("Nota3: ");
		n3=ler.nextInt();
		
		System.out.println("Peso 3: ");
		p3=ler.nextInt();
		
		mp = ((n1*p1) + (n2*p2) + (n3*p3)) / (p1+p2+p3);
		
		System.out.println("A média é: " + mp);
		
	}
	

}

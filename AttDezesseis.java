package Atividades;

import java.util.Scanner;

public class AttDezesseis {

	public static void main(String[] args) {

		Scanner Dezesseis = new Scanner(System.in);
		int valor;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe a nota do Aluno: ");
			valor = Dezesseis.nextInt();

			if (valor >= maior) {
				maior = valor;
			}
			if (valor <= menor) {
				menor = valor;
			}
		}
		System.out.println(" Maior nota é : " + maior);
		System.out.println(" Menor nota é : " + menor);

	}

}

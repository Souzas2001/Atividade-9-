package Atividades;

import java.util.Scanner;

public class attNine {

	public static void main(String[] args) {

		Scanner Nine = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {
			System.out.println("Insira o número: ");
			num = Nine.nextInt();

			if (num >= maior) {
				maior = num;
			}
			if (num <= menor) {
				menor = num;
			}
		}
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);

	}

}

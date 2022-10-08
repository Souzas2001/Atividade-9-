package Atividades;

import java.util.Scanner;

public class attTem {

	public static void main(String[] args) {

		Scanner Tem = new Scanner(System.in);

		double a, b, c;

		System.out.println("Insira o número: ");
		a = Tem.nextDouble();

		b = a;
		c = a--;

		if (a < 0) {
			System.out.println("Não existe fatorial para números negativos");
		}

		else if (a == 0 || a == 1) {
			System.out.println("O fatorial é 1.");
		} else {
			for (int i = 0; i < c; i++) {
				while (a > 0) {
					a--;
					b = b * (a);
					break;
				}
			}
			System.out.println("O fatorial para este número é: " + a);
		}
	}
}

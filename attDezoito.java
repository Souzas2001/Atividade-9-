package Atividades;

import java.util.Scanner;

public class attDezoito {

	public static void main(String[] args) {

		Scanner dezoito;
		dezoito = new Scanner(System.in);

		double tempo, soma = 0, maior, menor;
		int t, vr19 = 0, vr16 = 0;

		menor = maior = 19.06 + 0.211 * Math.cos(0.08721) + (-5.51 * Math.sin(0.08721));

		for (t = 1; t <= 48; t++) {
			tempo = 19.06 + 0.211 * Math.cos(0.08721 * t) + (-5.51 * Math.sin(0.08721 * t));
			System.out.format("temperatura na hora %dh = %.2f \n", t, tempo);

			soma += tempo;

			if (tempo > maior)
				maior = tempo;

			if (tempo < menor)
				menor = tempo;

			if (tempo < 16)
				vr16++;

			if (tempo > 19)
				vr19++;
		}

		System.out.format("Media = %.2f \n", soma / 48);
		System.out.format("Maior = %.2f \n", maior);
		System.out.format("Menor = %.2f \n", menor);
		System.out.println("Abaixo de 16°c teremos " + vr16);
		System.out.println("Acima de 19°c teremos " + vr19);
	}
}

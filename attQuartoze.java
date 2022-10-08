package Atividades;

import java.util.Scanner;

public class attQuartoze {

	public static void main(String[] args) {

		Scanner Quartoze = new Scanner(System.in);

		double kilo, sexo;
		int c10 = 0;
		int c20 = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Insira a seu peso em KG: ");
			kilo = Quartoze.nextDouble();
			System.out.println("Informe o genero: \n1 - Masculino \n2 - Feminino ");
			sexo = Quartoze.nextDouble();

			if (sexo == 1 && kilo >= 60 && kilo <= 80) {
				c10++;
			}
			if (sexo == 2 && kilo >= 50 && kilo <= 70) {
				c20++;
			}
		}

		System.out.println("Homens com peso entre 60Kg e 80kg:" + c10 + "\nMulheres com peso entre 50Kg e 70kg:" + c20);
	}

}

package Atividades;

import java.util.Scanner;

public class AttTwoelve {
		  public static void main(String[] args) {
			    Scanner Doze = new Scanner(System.in);

			    double numero, alt, x;

			    System.out.println("Insira um número: ");
			    numero = Doze.nextDouble();
			    x = numero;
			    
			    for (int i = 1; i <= x; i++) {

			      alt = numero % 2;
			      numero--;
			      
			      if (alt == 1) {
			        System.out.println("Número par: " + numero);
			      
			      }
			    }
			  }

	}



package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = sc.nextInt();
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = sc.nextInt();
			System.out.println();

			try {
				contar(parametroUm, parametroDois);

			} catch (ParametrosInvalidosException exception) {
				System.out.println("EXCEÇÃO: O segundo parâmetro deve ser maior que o primeiro.");
				
			}
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		} else {
			for (int i = 1; i <= parametroDois-parametroUm; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
	}

}